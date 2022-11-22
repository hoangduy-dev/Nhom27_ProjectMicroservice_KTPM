package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public User add(@RequestBody User user) {
		return userService.add(user);
	}
	@GetMapping("/users/{id}")
	public User findById(@PathVariable("id") int id) {
		return userService.findById(id);
	}
}
