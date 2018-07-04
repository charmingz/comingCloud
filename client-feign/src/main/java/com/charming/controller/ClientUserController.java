package com.charming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.charming.service.UserClientService;

@RestController
public class ClientUserController {
	@Autowired
	private UserClientService userClientService;
	
	@RequestMapping("/sayHi")
	public String getName(@RequestParam String name) {
		return userClientService.getName(name);
	}
	
	public String getNameError(String name) {
		return "provider-user error! param:name="+name;
	}
}
