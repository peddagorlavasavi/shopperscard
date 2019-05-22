package com.hcl.shopperscard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.shopperscard.entity.User;
import com.hcl.shopperscard.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public User getUser(Long userId) {
		return userRepository.getOne(userId);
	}
}
