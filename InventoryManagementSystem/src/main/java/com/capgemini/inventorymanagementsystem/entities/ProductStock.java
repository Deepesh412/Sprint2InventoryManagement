package com.capgemini.inventorymanagementsystem.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productstock")
public class ProductStock {
	
	@Id
	@Column(name = "product_id")
	private int productId;
	@Column(name = "item_name")
	private String itemName;
	@Column(name = "quantity_unit")
	private int quantityUnit;
	@Column(name = "price_per_unit")
	private double pricePerUnit;
	@Column(name="manufacturing_date")
	LocalDate manufacturingDate;
	@Column(name="expiry_date")
	LocalDate expiryDate;
	
    public ProductStock() {

    }

	public ProductStock(int productId, String itemName, int quantityUnit, double pricePerUnit,
			LocalDate manufacturingDate, LocalDate expiryDate) {
		super();
		this.productId = productId;
		this.itemName = itemName;
		this.quantityUnit = quantityUnit;
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

	public int getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(int quantityUnit) {
		this.quantityUnit = quantityUnit;
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