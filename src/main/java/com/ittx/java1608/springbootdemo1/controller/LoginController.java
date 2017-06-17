package com.ittx.java1608.springbootdemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ittx.java1608.springbootdemo1.mapper.UserMapper;
import com.ittx.java1608.springbootdemo1.model.User;
import com.ittx.java1608.springbootdemo1.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "welcome to springboot";
	}

	@RequestMapping("/json")
	@ResponseBody
	public User json() {
		User user = new User(1001, "小明", "123");
		return user;
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/login_submit")
	public String loginSubmit(String username, String password, Model model) {
		String message = "username:" + username + " password :" + password;
		System.out.println(message);
		
		User user = userMapper.login(username);
		
		if(user != null){
			model.addAttribute("message", "登录成功"+user.getUsername());
		}else{
			model.addAttribute("message", "登录失败");
		}
		return "login";
	}
	
	
}
