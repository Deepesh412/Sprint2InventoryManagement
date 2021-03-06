package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagementsystem.dao.ProductStockRepository;
import com.capgemini.inventorymanagementsystem.entities.ProductStock;

@Service
@Transactional
public class ProductStockServiceImpl implements ProductStockService {

	@Autowired
	ProductStockRepository pdao;
	
	@Override
	public ProductStock addProductStock(ProductStock p) {
		return pdao.save(p);
	}
	
	@Override
	public List<ProductStock> viewProductStock() {
		return pdao.findAll();
	}

}
