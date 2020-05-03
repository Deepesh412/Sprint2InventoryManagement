package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import com.capgemini.inventorymanagementsystem.entities.ProductStock;

public interface ProductStockService {

	public ProductStock addProductStock(ProductStock p); 

	public List<ProductStock> viewProductStock();
	 
}


