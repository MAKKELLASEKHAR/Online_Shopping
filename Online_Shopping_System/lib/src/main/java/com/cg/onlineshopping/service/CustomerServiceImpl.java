package com.cg.onlineshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineshopping.entities.Customer;
import com.cg.onlineshopping.exceptions.CustomerAlreadyExistException;
import com.cg.onlineshopping.exceptions.CustomerNotFoundException;
import com.cg.onlineshopping.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerrepo;
	@Override
	public void addCustomer(Customer customer) {
		Optional<Customer> addingcustomer = customerrepo.findById(customer.getCustomer_id());
		System.out.println(addingcustomer);
		if(!addingcustomer.isEmpty())
			throw new CustomerAlreadyExistException();
		customerrepo.save(customer);
	}
	@Override
	public List<Customer> viewAllCustomer() {
		
		return customerrepo.findAll();
	}
	@Override
	public Optional<Customer> getCustomerById(int customer_id) {
		Optional<Customer> customerdetails = customerrepo.findById(customer_id);
		if(customerdetails.isEmpty())
			throw new CustomerNotFoundException();
		return customerdetails;
	}
	@Override
	public void updateCustomer(Customer customer) {
		customerrepo.save(customer);
		
	}
	@Override
	public void deleteCustomer(int customer_id) {
		customerrepo.deleteById(customer_id);
		
	}

}
