package com.capgemini.inventorymanagementsystem.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rawmaterialstock")
public class RawMaterialStock {
	@Id
	@Column(name = "raw_material_id")
	private int rawmaterialId;
	@Column(name = "item_name")
	private String itemName;
	@Column(name = "price_per_unit")
	private double pricePerUnit;
	@Column(name="manufacturing_date")
	LocalDate manufacturingDate;
	@Column(name="expiry_date")
	LocalDate expiryDate;
	
public RawMaterialStock() {
		
	}

public RawMaterialStock(int rawmaterialId, String itemName, double pricePerUnit,
		LocalDate manufacturingDate, LocalDate expiryDate) {
	super();
	this.rawmaterialId = rawmaterialId;
	this.itemName = itemName;
	this.pricePerUnit = pricePerUnit;
	this.manufacturingDate = manufacturingDate;
	this.expiryDate = expiryDate;
}


public int getRawmaterialId() {
	return rawmaterialId;
}

public void setRawmaterialId(int rawmaterialId) {
	this.rawmaterialId = rawmaterialId;
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public double getPricePerUnit() {
	return pricePerUnit;
}

public void setPricePerUnit(double pricePerUnit) {
	this.pricePerUnit = pricePerUnit;
}

public LocalDate getManufacturingDate() {
	return manufacturingDate;
}

public void setManufacturingDate(LocalDate manufacturingDate) {
	this.manufacturingDate = manufacturingDate;
}

public LocalDate getExpiryDate() {
	return expiryDate;
}

public void setExpiryDate(LocalDate expiryDate) {
	this.expiryDate = expiryDate;
}

     

}
