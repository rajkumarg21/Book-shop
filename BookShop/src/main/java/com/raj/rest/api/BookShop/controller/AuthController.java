package com.raj.rest.api.BookShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.rest.api.BookShop.entities.User;
import com.raj.rest.api.BookShop.model.LoginModel;
import com.raj.rest.api.BookShop.services.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginModel loginRequest) {
	String login = authService.login(loginRequest);
		return ResponseEntity.ok(login);
	}
}
