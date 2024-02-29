package com.raj.rest.api.BookShop.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.rest.api.BookShop.entities.Book;
import com.raj.rest.api.BookShop.model.BookModel;
import com.raj.rest.api.BookShop.repository.BookRepository;

@Service
public class BookSeviceImp {

	@Autowired
	private BookRepository bookRepository;

	public Book addBook(BookModel bookDTO) {
		Book book = new Book();
		book.setTitle(bookDTO.getTitle());
		book.setAuthor(bookDTO.getAuthor());
		book.setDescription(bookDTO.getDescription());
		book.setPrice(bookDTO.getPrice());
		book.setQuantityAvailable(bookDTO.getQuantityAvailable());
		book.setGenre(bookDTO.getGenre());
		book.setPublicationDate(bookDTO.getPublicationDate());
		book.setPublisher(bookDTO.getPublisher());

		return bookRepository.save(book);
	}

}
