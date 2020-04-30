package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagementsystem.dao.SupplierDetailsRepository;
import com.capgemini.inventorymanagementsystem.entities.SupplierDetails;
@Service
@Transactional
public class SupplierDetailsServiceImpl implements SupplierDetailsService {

	@Autowired
	SupplierDetailsRepository sdao;
	
	@Override
	public SupplierDetails addSupplierDetails(SupplierDetails s) {
		
		return sdao.save(s);
	}

	@Override
	public SupplierDetails viewSupplierDetails(int supplierId) {
		
	    return sdao.findById(supplierId).get();
	}

	@Override
	public List<SupplierDetails> viewSupplierDetails() {

		return sdao.findAll();
	}

}
