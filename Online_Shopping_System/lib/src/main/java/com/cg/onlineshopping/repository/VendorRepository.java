package com.cg.onlineshopping.repository;


import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineshopping.entities.Vendor;

@Repository
public interface VendorRepository extends CrudRepository<Vendor, Long>{

	Optional<Vendor> findByusername(String username);
	//Optional<Vendor> findByUsernameAndEmail(String username, String email);

	Optional<Vendor> findByemail(String username);

	Vendor getVendorById(int vendor_id);

	Optional<Vendor> findById(int vendor_id);

}