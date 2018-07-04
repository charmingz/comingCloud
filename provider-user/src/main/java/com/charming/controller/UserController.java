package com.charming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/getName")
	public String hello(@RequestParam String name) {
		return "provider-user return:" + name;
	}
}
