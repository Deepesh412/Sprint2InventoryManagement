package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import com.capgemini.inventorymanagementsystem.entities.ProductStock;

public interface ProductStockService {

	public ProductStock addProductStock(ProductStock p); 
	
	public ProductStock viewProductStock(int productId);

	public List<ProductStock> viewProductStock();
	 
	public ProductStock modifyProductStock(ProductStock p);

	public void deleteProductStock(int productId);
}


