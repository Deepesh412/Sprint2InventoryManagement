package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagementsystem.dao.RawMaterialStockRepository;
import com.capgemini.inventorymanagementsystem.entities.RawMaterialStock;

@Service
@Transactional
public class RawMaterialStockServiceimpl implements RawMaterialStockService {

	@Autowired
	RawMaterialStockRepository rdao;
	
	@Override
	public RawMaterialStock addRawMaterialStock(RawMaterialStock r) {
		return rdao.save(r);
	}

	@Override
	public List<RawMaterialStock> viewRawMaterialStock() {
		return rdao.findAll();
	}

}
