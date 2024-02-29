package com.raj.rest.api.BookShop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.raj.rest.api.BookShop.entities.Login;
import com.raj.rest.api.BookShop.entities.User;
import com.raj.rest.api.BookShop.model.LoginModel;
import com.raj.rest.api.BookShop.model.UserRegistrationModel;
import com.raj.rest.api.BookShop.repository.LoginRepository;
import com.raj.rest.api.BookShop.repository.UserRepository;

@Service
public class AuthService {

	@Autowired
	private LoginRepository loginRepository;

	@Autowired
	private UserRepository userRepository;
 
	private User user;

	public String login(LoginModel loginRequest) {
		String username = loginRequest.getUsername();
		String password = loginRequest.getPassword();

		Login login = loginRepository.findByUsername(username);
		if (login != null && login.getPassword().equals(password)) {
  
            return "login Successfull";
        }  else {
			throw new RuntimeException("Invalid username or password");
		}
	}

}
