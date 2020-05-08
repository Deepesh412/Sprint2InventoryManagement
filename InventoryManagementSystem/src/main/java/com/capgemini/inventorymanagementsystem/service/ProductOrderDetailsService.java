package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import com.capgemini.inventorymanagementsystem.entities.ProductOrderDetails;

public interface ProductOrderDetailsService {

	public ProductOrderDetails addProductOrderDetails(ProductOrderDetails po); 

	 public ProductOrderDetails viewProductOrderDetailsById(int orderId);
	 
	 public List<ProductOrderDetails> viewProductOrderDetails();
	 
}
