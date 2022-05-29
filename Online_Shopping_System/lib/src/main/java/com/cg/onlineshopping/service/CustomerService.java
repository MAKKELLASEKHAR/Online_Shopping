package com.cg.onlineshopping.service;

import java.util.List;
import java.util.Optional;

import com.cg.onlineshopping.entities.Customer;

public interface CustomerService {
	
	void addCustomer(Customer customer);
	List<Customer> viewAllCustomer();
	Optional<Customer> getCustomerById(int customer_id);
	void updateCustomer(Customer customer);
	void deleteCustomer(int customer_id);

}
