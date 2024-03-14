package com.raj.rest.api.BookShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.rest.api.BookShop.model.UserRegistrationModel;
import com.raj.rest.api.BookShop.services.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody UserRegistrationModel userDTO) {
		userService.registerUser(userDTO);
		return ResponseEntity.ok("User registered successfully");
	}
	
}
