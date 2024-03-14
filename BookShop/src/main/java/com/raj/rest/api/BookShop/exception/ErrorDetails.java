package com.raj.rest.api.BookShop.exception;

import java.sql.Date;
import java.time.LocalDateTime;

/*
 * Rajkumar saad
   date: 06/03/2024
*/
public class ErrorDetails {
	private LocalDateTime timestamp;
	private String message;
	private String path;
	private String errorCode;

	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorDetails(LocalDateTime localDateTime, String message, String path, String errorCode) {
		this.timestamp = localDateTime;
		this.message = message;
		this.path = path;
		this.errorCode = errorCode;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getpath() {
		return path;
	}

	public String getErorrCode() {
		return errorCode;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
