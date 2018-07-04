package com.charming.service;

import org.springframework.stereotype.Component;

@Component
public class UserClientServiceHystrix implements UserClientService {

	@Override
	public String getName(String name) {
		return "UserClientService Hystrix Error! param --> name="+name;
	}

}
