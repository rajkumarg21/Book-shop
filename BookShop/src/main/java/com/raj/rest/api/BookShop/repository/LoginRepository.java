package com.raj.rest.api.BookShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.rest.api.BookShop.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {
	Login findByUsername(String username);
}
