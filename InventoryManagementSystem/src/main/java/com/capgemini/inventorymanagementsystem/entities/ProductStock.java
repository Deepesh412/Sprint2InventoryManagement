package com.capgemini.inventorymanagementsystem.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productstock")
public class ProductStock implements Serializable{
	
	@Id
	@Column(name = "product_id")
	private int productId;
	@Column(name = "item_name")
	private String itemName;
	@Column(name = "price_per_unit")
	private double pricePerUnit;
	@Column(name="manufacturing_date")
	LocalDate manufacturingDate;
	@Column(name="expiry_date")
	LocalDate expiryDate;
	
    public ProductStock()  {

    }

	public ProductStock(int productId, String itemName, double pricePerUnit, LocalDate manufacturingDate,
			LocalDate expiryDate) {
		super();
		this.productId = productId;
		this.itemName = itemName;
		this.pricePerUnit = pricePerUnit;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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