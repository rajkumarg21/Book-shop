package com.raj.rest.api.BookShop.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.rest.api.BookShop.Converter.DtoConverter;
import com.raj.rest.api.BookShop.entities.Book;
import com.raj.rest.api.BookShop.exception.EmailAlreadyExistsException;
import com.raj.rest.api.BookShop.exception.ResourceNotFoundException;
import com.raj.rest.api.BookShop.model.BookModel;
import com.raj.rest.api.BookShop.repository.BookRepository;

@Service

public class BookSeviceImp implements BookService {

	@Autowired
	private BookRepository bookRepository;

	public BookModel addBook(BookModel bookDTO) {
		Optional<Book> book1= bookRepository.findByTitle(bookDTO.getTitle());
		if(book1.isPresent()) {
			throw new EmailAlreadyExistsException("Email Already Exists for User");
		}
		Book book = DtoConverter.DtoToEntity(bookDTO);
		Book savedBook = bookRepository.save(book);
		BookModel shavedBookmodel = DtoConverter.EntityToDto(savedBook);
		return shavedBookmodel;
	}

	@Override
	public List<BookModel> getBooks() {

		List<Book> book = bookRepository.findAll();
		return book.stream().map(DtoConverter::EntityToDto).collect(Collectors.toList());
	}

	@Override
	public BookModel updateBook(BookModel book) {

		Book existingBook = bookRepository.findById(book.getBookId())
				.orElseThrow(() -> new ResourceNotFoundException("Book", "id", book.getBookId()));

		existingBook.setTitle(book.getTitle());
		existingBook.setAuthor(book.getAuthor());
		existingBook.setDescription(book.getDescription());
		existingBook.setGenre(book.getGenre());
		existingBook.setPrice(book.getPrice());
		existingBook.setPublicationDate(book.getPublicationDate());
		existingBook.setPublisher(book.getPublisher());
		existingBook.setQuantityAvailable(book.getQuantityAvailable());
		Book updatedBook = bookRepository.save(existingBook);
		return DtoConverter.EntityToDto(updatedBook);

	}

	@Override
	public void deleteBook(Long bookId) {

		Book existingBook = bookRepository.findById(bookId)
				.orElseThrow(() -> new ResourceNotFoundException("Book", "id", bookId));

		bookRepository.deleteById(bookId);

	}

	@Override
	public BookModel getBookById(Long bookId) {
		Book book = bookRepository.findById(bookId)
				.orElseThrow(() -> new ResourceNotFoundException("Book", "id", bookId));

		return DtoConverter.EntityToDto(book);
	}

}
