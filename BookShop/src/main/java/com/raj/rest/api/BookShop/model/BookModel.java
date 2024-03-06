package com.raj.rest.api.BookShop.model;

import java.time.LocalDate;

public class BookModel {
	private Long bookId;
	private String title;
	private String author;
	private String description;
	private double price;
	private Integer quantityAvailable;
	private String genre;
	private LocalDate publicationDate;
	private String publisher;
	
 
	
	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(Integer quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public BookModel(Long bookId,String title, String author, String description, double price, Integer quantityAvailable,
			String genre, LocalDate publicationDate, String publisher) {
		super();
		this.bookId=bookId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.price = price;
		this.quantityAvailable = quantityAvailable;
		this.genre = genre;
		this.publicationDate = publicationDate;
		this.publisher = publisher;
	}

}
