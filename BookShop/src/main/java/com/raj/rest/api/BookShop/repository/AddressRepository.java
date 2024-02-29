package com.raj.rest.api.BookShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.rest.api.BookShop.entities.Address;

public interface AddressRepository extends JpaRepository< Address, Long> {
}
