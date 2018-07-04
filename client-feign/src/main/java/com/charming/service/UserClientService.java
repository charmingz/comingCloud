package com.charming.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(name="PROVIDER-USER",fallback=UserClientServiceHystrix.class)
public interface UserClientService {
	@RequestMapping("/getName")
	String getName(@RequestParam(value="name") String name);
}
