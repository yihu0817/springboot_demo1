package com.ittx.java1608.springbootdemo1.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/confignew")
@ConfigurationProperties(prefix="test")
public class ConfigeControllerNew {
	private String username;
	
	private String password;

	@RequestMapping("")
	@ResponseBody
	public String config() {
		return "config == "+username+" "+password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
