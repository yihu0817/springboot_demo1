package com.ittx.java1608.springbootdemo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ittx.java1608.springbootdemo1.mapper.UserMapper;
import com.ittx.java1608.springbootdemo1.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public void insert() {
		User user = new User(1001,"小明","abc");
		User userbig = new User(1002,"大明","123");
		
		userMapper.insertuser(user);
		
//		int i = 4/0;
		
		userMapper.insertuser(userbig);
	}

}
