package com.raj.rest.api.BookShop.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	// handle specific exceptions
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException exception,
                                                                        WebRequest webRequest){
        ErrorDetails errorDetails =  new ErrorDetails(LocalDateTime.now(), exception.getMessage(),
				webRequest.getDescription(false), "Book_not_found");
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

	/*
	 * @ExceptionHandler(BlogAPIException.class) public ResponseEntity<ErrorDetails>
	 * handleBlogAPIException(BlogAPIException exception, WebRequest webRequest){
	 * ErrorDetails errorDetails = new ErrorDetails(new Date(),
	 * exception.getMessage(), webRequest.getDescription(false)); return new
	 * ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST); }
	 */
    // global exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleGlobalException(Exception exception,
                                                               WebRequest webRequest){
        ErrorDetails errorDetails =  new ErrorDetails(LocalDateTime.now(), exception.getMessage(),
				webRequest.getDescription(false), "Book_not_found");
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<ErrorDetails> handleEmailAlreadyExistsException(EmailAlreadyExistsException exception,
                                                                        WebRequest webRequest){
    	ErrorDetails errorDetails = new ErrorDetails(
                LocalDateTime.now(),
                exception.getMessage(),
                webRequest.getDescription(false),
                "USER_EMAIL_ALREADY_EXISTS"
        );

        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }

    
    
}
