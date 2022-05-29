package com.cg.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.onlineshopping.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	
	@Query(value="select customer from Customer customer where customer.customer_id=?1")
	Customer getCustomerById(int customer_id);

}
