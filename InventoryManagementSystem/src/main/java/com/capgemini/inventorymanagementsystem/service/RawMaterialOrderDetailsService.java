package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import com.capgemini.inventorymanagementsystem.entities.RawMaterialOrderDetails;

public interface RawMaterialOrderDetailsService {
	
	 
	
     public RawMaterialOrderDetails addRawMaterialOrderDetails( RawMaterialOrderDetails rmo);

	 public RawMaterialOrderDetails viewRawMaterialOrderDetailsById(int orderId);
	 
	 public List<RawMaterialOrderDetails> viewRawMaterialOrderDetails();
	
}
