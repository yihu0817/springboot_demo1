package com.ittx.java1608.springbootdemo1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/config")
public class ConfigeController {
	@Value(value="${test.username}")
	private String userName;
	
	@Value(value="${test.password}")
	private String passWord;
	

	@RequestMapping("")
	@ResponseBody
	public String config() {
		return "config == "+userName+" "+passWord;
	}

}
