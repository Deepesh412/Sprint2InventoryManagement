package com.capgemini.inventorymanagementsystem.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productorderdetails")
public class ProductOrderDetails {
	
	@Id
	@Column(name = "order_id")
	private int orderId;
	@Column(name = "item_name")
	private String itemName;
	@Column(name = "quantity_unit")
	private int quantityUnit;
	@Column(name = "price_per_unit")
	private double pricePerUnit;
	@Column(name = "total_price")
	private double totalPrice;
	@Column(name = "order_date")
	LocalDate orderDate;
	@Column(name = "delivery_date")
	LocalDate deliveryDate;
	@Column(name = "delivery_status")
	private String deliveryStatus;
	
	@OneToOne
	@JoinColumn(name = "distributor", referencedColumnName = "distributor_id")
    private DistributorDetails distributor;
	
	public ProductOrderDetails()
	{
		
	}

	public ProductOrderDetails(int orderId, String itemName, int quantityUnit, double pricePerUnit, double totalPrice,
			LocalDate orderDate, LocalDate deliveryDate, String deliveryStatus, DistributorDetails distributor) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.quantityUnit = quantityUnit;
		this.pricePerUnit = pricePerUnit;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.deliveryStatus = deliveryStatus;
		this.distributor = distributor;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public DistributorDetails getDistributor() {
		return distributor;
	}

	public void setDistributor(DistributorDetails distributor) {
		this.distributor = distributor;
	}

	
	
}

