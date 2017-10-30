package com.hk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.hk.bean.User;
import com.hk.mapper.UserMapper;

public class UserService {
	
	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;
	
	@Transactional
	public void addUser(User user){
		//调用mapper
		userMapper.addUser(user);
	}
}
