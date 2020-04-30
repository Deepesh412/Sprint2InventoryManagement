package com.capgemini.inventorymanagementsystem.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "placermorder")
public class PlaceAnRMOrder implements Serializable {
	@Id
	@Column(name = "quantity_unit")
	private int quantityUnit;
  
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "item_name",referencedColumnName = "item_name")
	private RawMaterialStock itemname;

	public PlaceAnRMOrder(int quantityUnit, RawMaterialStock itemname) {
		super();
		this.quantityUnit = quantityUnit;
		this.itemname = itemname;
	}

	public int getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(int quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public RawMaterialStock getItemname() {
		return itemname;
	}

	public void setItemname(RawMaterialStock itemname) {
		this.itemname = itemname;
	}


	
}
