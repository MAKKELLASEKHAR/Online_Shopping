package com.cg.onlineshopping.service;

import java.util.List;

import com.cg.onlineshopping.entities.Customer;

public interface CustomerService {
	
	void addCustomer(Customer customer);
	List<Customer> viewAllCustomer();

}
