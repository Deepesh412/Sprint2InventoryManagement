package com.capgemini.inventorymanagementsystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "distributordetails")
public class DistributorDetails {
	@Id
	@Column(name ="distributor_id")
	private int distributorId;
	@Column(name = "distributor_name")
	private String distributorName;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "address")
	private String address;
	@Column(name = "phone_number")
	private long phonenumber;
	@Column(name = "email_id")
	private String emailId;
	
	public DistributorDetails()
	{
		
	}

	public DistributorDetails(int distributorId, String distributorName, String productName, String address,
			long phonenumber, String emailId) {
		super();
		this.distributorId = distributorId;
		this.distributorName = distributorName;
		this.productName = productName;
		this.address = address;
		this.phonenumber = phonenumber;
		this.emailId = emailId;
	}

	public int getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(int distributorId) {
		this.distributorId = distributorId;
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}