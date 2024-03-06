
package com.raj.rest.api.BookShop.Converter;

import com.raj.rest.api.BookShop.entities.Book;
import com.raj.rest.api.BookShop.model.BookModel;

public class DtoConverter {
	// convert DTO to entity
	public static Book DtoToEntity(BookModel bookModel) {
		Book book =new Book(
				bookModel.getBookId(),
				bookModel.getTitle(),
				bookModel.getAuthor(),
				bookModel.getDescription(),
				bookModel.getPrice(),
				bookModel.getQuantityAvailable(),
				bookModel.getGenre(),
				bookModel.getPublicationDate(),
				bookModel.getPublisher()
				
				);
		return book;
	}
		// convert entity to DTO/model dao
		public static BookModel EntityToDto(Book book) {
			BookModel bookModel =new BookModel(
					book.getBookId(),
					book.getTitle(),
					book.getAuthor(),
					book.getDescription(),
					book.getPrice(),
					book.getQuantityAvailable(),
					book.getGenre(),
					book.getPublicationDate(),
					book.getPublisher()	
					);
			
			return bookModel;
		}
	}


