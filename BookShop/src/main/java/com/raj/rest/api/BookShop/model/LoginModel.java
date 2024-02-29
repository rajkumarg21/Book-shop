package com.raj.rest.api.BookShop.model;

import com.raj.rest.api.BookShop.entities.User;

public class LoginModel {
	
	private String username;
    private String password;
    private User user;
    
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    

}
