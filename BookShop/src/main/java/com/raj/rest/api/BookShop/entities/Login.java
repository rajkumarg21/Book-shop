package com.raj.rest.api.BookShop.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

/*
 * Authore : Rajkumar Saad
*/

@Entity
@Table(name = "login1", schema = "core")
@Data
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loginid")
	private Long loginId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid", nullable = false)
	private User user;

	@Column(name = "username", unique = true, nullable = false)
	private String username;

	@Column(name = "password", nullable = false)
	private String password;

	public Login(Long loginId, String username, String password, User user) {
		super();
		this.loginId = loginId;
		this.username = username;
		this.password = password;
		this.user =user;
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getLoginId() {
		return loginId;
	}

	public void setLoginId(Long loginId) {
		this.loginId = loginId;
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

	// Constructors, getters, and setters
}
