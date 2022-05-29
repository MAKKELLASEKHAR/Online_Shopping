package com.cg.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineshopping.entities.Customer;
import com.cg.onlineshopping.service.CustomerServiceImpl;

@RestController
@RequestMapping
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl service;
	
	@PostMapping
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer){
		service.addCustomer(customer);
		return new ResponseEntity<String>("inserted",HttpStatus.OK);
		
	}
	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomer(){
		List<Customer> customerlist = service.viewAllCustomer();
		return new ResponseEntity<List<Customer>>(customerlist,HttpStatus.OK);
		
	}

}
