package com.cg.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.onlineshopping.entities.Orders;
import com.cg.onlineshopping.entities.Vendor;

@Repository
public interface VendorRepository  extends JpaRepository<Orders,Integer>{
	
	@Query(value="select vendor from Vendor vendor  where vendor.vendor_id=?1")
	Vendor getVendorById(int vendor_id);


}
