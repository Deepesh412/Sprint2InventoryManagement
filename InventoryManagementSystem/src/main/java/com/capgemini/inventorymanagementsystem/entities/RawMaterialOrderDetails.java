package com.capgemini.inventorymanagementsystem.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rawmaterialorderdetails")
public class RawMaterialOrderDetails implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "order_id")
	private int orderId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="rawmaterial_id", referencedColumnName="raw_material_id")
	private RawMaterialStock rawmaterialId;
	
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
    
	
	public RawMaterialOrderDetails()
	{
		
	}


	public RawMaterialOrderDetails(int orderId, RawMaterialStock rawmaterialId, int quantityUnit, double totalPrice,
			Date orderDate, Date deliveryDate, String deliveryStatus) {
		super();
		this.orderId = orderId;
		this.rawmaterialId = rawmaterialId;
		this.quantityUnit = quantityUnit;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.deliveryStatus = deliveryStatus;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public RawMaterialStock getRawmaterialId() {
		return rawmaterialId;
	}


	public void setRawmaterialId(RawMaterialStock rawmaterialId) {
		this.rawmaterialId = rawmaterialId;
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


	
}

