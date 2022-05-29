package com.cg.onlineshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineshopping.entities.Customer;
import com.cg.onlineshopping.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerrepo;
	@Override
	public void addCustomer(Customer customer) {
		Optional<Customer> addingcustomer = customerrepo.findById(customer.getCustomer_id());
		System.out.println(addingcustomer);
		customerrepo.save(customer);
	}
	@Override
	public List<Customer> viewAllCustomer() {
		
		return customerrepo.findAll();
	}

}
