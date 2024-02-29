package com.raj.rest.api.BookShop.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.rest.api.BookShop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}