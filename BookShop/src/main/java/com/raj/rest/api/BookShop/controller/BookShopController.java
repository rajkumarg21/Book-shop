package com.raj.rest.api.BookShop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.rest.api.BookShop.entities.Book;
import com.raj.rest.api.BookShop.model.BookModel;
import com.raj.rest.api.BookShop.services.BookSeviceImp;

@RestController
@RequestMapping("/api/books")
public class BookShopController {

	@Autowired
	private BookSeviceImp bookServiceIml;

	@PostMapping("/add")
	public ResponseEntity<Book> addBook(@RequestBody BookModel bookDTO) {
		Book book = bookServiceIml.addBook(bookDTO);
		return ResponseEntity.ok(book);
	}

}
