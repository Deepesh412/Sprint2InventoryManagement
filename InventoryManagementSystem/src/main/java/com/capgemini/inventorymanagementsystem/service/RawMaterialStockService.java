package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import com.capgemini.inventorymanagementsystem.entities.RawMaterialStock;

public interface RawMaterialStockService {

	public RawMaterialStock addRawMaterialStock(RawMaterialStock r);
	
	public List<RawMaterialStock> viewRawMaterialStock();
	 
	public RawMaterialStock modifyRawMaterialStock(RawMaterialStock r);
	
	 public void deleteRawMaterialStock(int rawmaterialId);
	 
}
