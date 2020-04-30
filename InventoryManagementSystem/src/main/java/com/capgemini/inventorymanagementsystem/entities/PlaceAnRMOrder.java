package com.capgemini.inventorymanagementsystem.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "placermorder")
public class PlaceAnRMOrder {
	@Id
	@Column(name = "quantity_unit")
	private int quantityUnit;
	
   @JsonIgnore
	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "rawmaterial_id",referencedColumnName = "raw_material_id")
   @NotFound(action = NotFoundAction.IGNORE)
	private RawMaterialStock rawmaterialId;
	
   @JsonIgnore
	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "item_name",referencedColumnName = "item_name")
   @NotFound(action = NotFoundAction.IGNORE)
	private RawMaterialStock itemName;
   
  public PlaceAnRMOrder(int quantityUnit, RawMaterialStock rawmaterialId, RawMaterialStock itemName) {
	super();
	this.quantityUnit = quantityUnit;
	this.rawmaterialId = rawmaterialId;
	this.itemName = itemName;
    }

public int getQuantityUnit() {
	return quantityUnit;
}

public void setQuantityUnit(int quantityUnit) {
	this.quantityUnit = quantityUnit;
}

public RawMaterialStock getRawmaterialId() {
	return rawmaterialId;
}

public void setRawmaterialId(RawMaterialStock rawmaterialId) {
	this.rawmaterialId = rawmaterialId;
}

public RawMaterialStock getItemName() {
	return itemName;
}

public void setItemName(RawMaterialStock itemName) {
	this.itemName = itemName;
}

	
}
