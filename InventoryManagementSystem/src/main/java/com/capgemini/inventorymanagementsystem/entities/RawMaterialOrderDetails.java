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
@Table(name = "rawmaterialorderdetails")
public class RawMaterialOrderDetails implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "order_id")
	private int orderId;
	@Column(name = "price_per_unit")
	private double pricePerUnit;
	@Column(name = "total_price")
	private double totalPrice;
	@Column(name = "order_date")
	private Date orderDate;
	@Column(name = "delivery_date")
	private Date deliveryDate;
	@Column(name = "delivery_status")
	private String deliveryStatus;
    
	@OneToOne
	@JoinColumn(name="supplier", referencedColumnName="supplier_id")
	private SupplierDetails supplierId;
	
	@OneToOne
	@JoinColumn(name="item_name", referencedColumnName="item_name")
	private PlaceAnRMOrder itemname;
	
	@OneToOne
	@JoinColumn(name="quantity_unit", referencedColumnName="quantity_unit")
	private PlaceAnRMOrder quantityunit;
	
	public RawMaterialOrderDetails()
	{
		
	}

	public RawMaterialOrderDetails(int orderId, double pricePerUnit, double totalPrice, Date orderDate,
			Date deliveryDate, String deliveryStatus, SupplierDetails supplierId, PlaceAnRMOrder itemname,
			PlaceAnRMOrder quantityunit) {
		super();
		this.orderId = orderId;
		this.pricePerUnit = pricePerUnit;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.deliveryStatus = deliveryStatus;
		this.supplierId = supplierId;
		this.itemname = itemname;
		this.quantityunit = quantityunit;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

	public SupplierDetails getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(SupplierDetails supplierId) {
		this.supplierId = supplierId;
	}

	public PlaceAnRMOrder getItemname() {
		return itemname;
	}

	public void setItemname(PlaceAnRMOrder itemname) {
		this.itemname = itemname;
	}

	public PlaceAnRMOrder getQuantityunit() {
		return quantityunit;
	}

	public void setQuantityunit(PlaceAnRMOrder quantityunit) {
		this.quantityunit = quantityunit;
	}

	
	
}
