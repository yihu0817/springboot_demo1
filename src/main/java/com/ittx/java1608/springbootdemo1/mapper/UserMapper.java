package com.ittx.java1608.springbootdemo1.mapper;

import org.springframework.stereotype.Repository;

import com.ittx.java1608.springbootdemo1.model.User;

@Repository("userMapper")
public interface UserMapper {
	public User login(String username);
	void insertuser(User user);
}
