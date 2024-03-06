package com.raj.rest.api.BookShop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.rest.api.BookShop.entities.Book;
import com.raj.rest.api.BookShop.model.BookModel;
import com.raj.rest.api.BookShop.services.BookService;
import com.raj.rest.api.BookShop.services.BookSeviceImp;
import com.raj.rest.api.BookShop.services.UserService;

@RestController
@RequestMapping("/api/books")
public class BookShopController {

	@Autowired
	private BookSeviceImp bookServiceIml;
	
	@Autowired
	private BookService bookService;
	

	@PostMapping("/add")
	public ResponseEntity<BookModel> addBook(@RequestBody BookModel bookDTO) {
		BookModel book = bookServiceIml.addBook(bookDTO);
		return ResponseEntity.ok(book);
	}
	
	@GetMapping("/getbooks")
	public List<BookModel> getBooks(){
		
		return  bookServiceIml.getBooks();
	}
	
	//   http://localhost:8080/api/books/book/id
	@GetMapping("book/{id}")
    public ResponseEntity<BookModel> getUserById(@PathVariable("id") Long bookId){
		BookModel book = bookService. getBookById(bookId);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

	//    http://localhost:8080/update/1
	@PutMapping("update/{id}")
	public ResponseEntity<BookModel> updateBook(@PathVariable("id") Long bookId, @RequestBody BookModel book){
		book.setBookId(bookId);
		 BookModel updatedBook = bookService.updateBook(book);
	        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        bookService.deleteBook(userId);
        return new ResponseEntity<>("book removed successfully deleted!", HttpStatus.OK);

}
}
