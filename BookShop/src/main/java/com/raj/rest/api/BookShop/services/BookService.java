package com.raj.rest.api.BookShop.services;

import java.util.List;

import com.raj.rest.api.BookShop.entities.Book;
import com.raj.rest.api.BookShop.model.BookModel;

public interface BookService {
	public List<BookModel> getBooks();

	public BookModel updateBook(BookModel book);

	public void deleteBook(Long bookId);

	BookModel getBookById(Long bookId);

}
