package com.capgemini.inventorymanagementsystem.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagementsystem.entities.SupplierDetails;

@Repository
public interface SupplierDetailsRepository extends JpaRepository<SupplierDetails,Serializable> {

}