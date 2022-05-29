package com.cg.onlineshopping.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptionHandler {
	
	@ExceptionHandler(value = CustomerNotFoundException.class)
	public ResponseEntity<Object> exception(CustomerNotFoundException exception){
		return new ResponseEntity<Object>("Customer Not Found...",HttpStatus.OK);
	}
	@ExceptionHandler(value = CustomerAlreadyExistException.class)
	public ResponseEntity<Object> exception(CustomerAlreadyExistException exception){
		return new ResponseEntity<Object>("Customer Already Exist...",HttpStatus.OK);
		
	}

}
