package com.raj.rest.api.BookShop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.rest.api.BookShop.entities.Book;
import com.raj.rest.api.BookShop.services.BookService;

@RestController
public class BookShopController {
    
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		
	return	this.bookService.getBooks();
		
	}
		
	
}
