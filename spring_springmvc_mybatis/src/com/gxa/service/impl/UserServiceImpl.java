package com.gxa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.gxa.mapper.UserMapper;
import com.gxa.model.User;
import com.gxa.service.UserService;
@Component
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public User login(User user) {
		return userMapper.login(user);
	}

}
