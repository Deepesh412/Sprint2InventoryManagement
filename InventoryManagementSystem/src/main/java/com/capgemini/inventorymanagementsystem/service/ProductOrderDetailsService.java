package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import com.capgemini.inventorymanagementsystem.entities.PlaceAnPOrder;
import com.capgemini.inventorymanagementsystem.entities.ProductOrderDetails;
import com.capgemini.inventorymanagementsystem.entities.ProductStock;

public interface ProductOrderDetailsService {

	public ProductOrderDetails addProductOrderDetails(ProductOrderDetails po, ProductStock p, PlaceAnPOrder plp); 

	 public ProductOrderDetails viewProductOrderDetails(int orderId);
	 
	 public List<ProductOrderDetails> viewProductOrderDetails();
	 
	/* public ProductOrderDetails modifyProductOrderDetails(ProductOrderDetails po);
	 
	  public void deleteProductOrderDetails(int orderId);
	*/
}
