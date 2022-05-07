package com.ie303m22.laptopweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ie303m22.laptopweb.model.User;
import com.ie303m22.laptopweb.repository.UserRepository;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	//DI = Dependency Injection
	@Autowired
	private UserRepository userrepository;
	
	@GetMapping
	public List<User> getAllUser(){
		return userrepository.findAll();
	}
}
