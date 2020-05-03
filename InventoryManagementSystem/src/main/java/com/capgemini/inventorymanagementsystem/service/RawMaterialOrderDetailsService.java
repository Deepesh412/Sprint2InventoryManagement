package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import com.capgemini.inventorymanagementsystem.entities.RawMaterialOrderDetails;
import com.capgemini.inventorymanagementsystem.entities.RawMaterialStock;

public interface RawMaterialOrderDetailsService {
	
	 
	
     public RawMaterialOrderDetails addRawMaterialOrderDetails( RawMaterialOrderDetails rmo);

	 public RawMaterialOrderDetails viewRawMaterialOrderDetailsById(int orderId);
	 
	 public List<RawMaterialOrderDetails> viewRawMaterialOrderDetails();
	 
	/* public RawMaterialOrderDetails modifyRawMaterialOrderDetails(RawMaterialOrderDetails rmo, PlaceAnRMOrder plo);
	 
	  public void deleteRawMaterialOrderDetails(int orderId);*/
}
