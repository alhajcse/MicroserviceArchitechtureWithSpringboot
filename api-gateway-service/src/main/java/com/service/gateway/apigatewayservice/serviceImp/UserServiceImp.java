package com.service.gateway.apigatewayservice.serviceImp;

import com.service.gateway.apigatewayservice.model.User;
import com.service.gateway.apigatewayservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.gateway.apigatewayservice.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserRepository userRepository;

	public String generateId(String fname,String lname) {
		String userId = fname + lname.substring(0, 2);
		return userId;
	}

	@Override
	public void savUser(User user) {
		userRepository.save(user);
	}

	@Override
	public boolean existsByUserName(String userName) {
		return userRepository.existsByUserName(userName);
	}

	@Override
	public boolean existsByEmail(String email) {
		return userRepository.existsByEmail(email);
	}



}
