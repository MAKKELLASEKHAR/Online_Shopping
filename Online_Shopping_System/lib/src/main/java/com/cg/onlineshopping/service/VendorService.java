package com.cg.onlineshopping.service;

import java.util.List;

import com.cg.onlineshopping.dto.VendorDto;
import com.cg.onlineshopping.entities.*;
import com.cg.onlineshopping.exceptions.ResourceNotFoundException;

public interface VendorService {

	public Vendor addVendor(Vendor vendor);

	public List<Vendor> getAllVendors() throws ResourceNotFoundException;

	public Vendor getVendorById(Long vendorId) throws ResourceNotFoundException;

	public Vendor updateVendor(Vendor vendor) throws ResourceNotFoundException;
	
	void deleteVendorById(Long vendorId) throws ResourceNotFoundException;
	
	public List<Product> getMenuByVendorId(long vendorId) throws ResourceNotFoundException;

	Vendor addVendor(VendorDto vendordto);

}