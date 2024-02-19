package com.raj.rest.api.BookShop.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.raj.rest.api.BookShop.entities.Book;

@Service
public class BookSeviceImp implements BookService {

	List<Book> book;
	public BookSeviceImp() {
		book=new ArrayList<Book>();
		book.add(new Book(1,"YOga","A complite book of yoga","swami vivekananda","2002"));
		book.add(new Book(2,"YOga","A complite book of yoga","swami vivekananda","2002"));
	}
	
	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return book;
	}

}
