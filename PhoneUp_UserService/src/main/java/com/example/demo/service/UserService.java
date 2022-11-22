package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User add(User user) {
		return userRepository.save(user);
	}
	public User findById(int id) {
		return userRepository.findById(id).get();
	}
}
