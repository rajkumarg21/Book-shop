package com.raj.rest.api.BookShop.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.rest.api.BookShop.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	Optional<Book> findByTitle(String title);
 
}
