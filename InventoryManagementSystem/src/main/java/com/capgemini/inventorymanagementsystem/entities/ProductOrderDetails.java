package com.capgemini.inventorymanagementsystem.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productorderdetails")
public class ProductOrderDetails implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "order_id")
	private int orderId;
	@Column(name = "quantity_unit")
	private int quantityUnit;
	@Column(name = "total_price")
	private double totalPrice;
	@Column(name = "order_date")
	private Date orderDate;
	@Column(name = "delivery_date")
	private Date deliveryDate;
	@Column(name = "delivery_status")
	private String deliveryStatus;
	
	@OneToOne
	@JoinColumn(name = "distributor", referencedColumnName = "distributor_id")
    private DistributorDetails distributor;
	
	@OneToOne
	@JoinColumn(name="product_id", referencedColumnName="product_id")
	private ProductStock productid;
	
	
	
	public ProductOrderDetails()
	{
		
	}



	public ProductOrderDetails(int orderId, int quantityUnit, double totalPrice, Date orderDate, Date deliveryDate,
			String deliveryStatus, DistributorDetails distributor, ProductStock productid) {
		super();
		this.orderId = orderId;
		this.quantityUnit = quantityUnit;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.deliveryStatus = deliveryStatus;
		this.distributor = distributor;
		this.productid = productid;
	}



	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public int getQuantityUnit() {
		return quantityUnit;
	}



	public void setQuantityUnit(int quantityUnit) {
		this.quantityUnit = quantityUnit;
	}



	public double getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}



	public Date getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}



	public Date getDeliveryDate() {
		return deliveryDate;
	}



	public void setDeliveryDate(Date deliveryDate) {
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



	public ProductStock getProductid() {
		return productid;
	}



	public void setProductid(ProductStock productid) {
		this.productid = productid;
	}


   
}

