package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import com.capgemini.inventorymanagementsystem.entities.SupplierDetails;

public interface SupplierDetailsService {

	public SupplierDetails addSupplierDetails(SupplierDetails s); 
	
	public SupplierDetails viewSupplierDetailsById(int supplierId);
	
	public List<SupplierDetails> viewSupplierDetails();
}
