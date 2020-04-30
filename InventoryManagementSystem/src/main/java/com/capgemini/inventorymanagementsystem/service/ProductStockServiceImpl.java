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
	public ProductStock viewProductStock(int productId) {
		return pdao.findById(productId).get();
	}

	@Override
	public List<ProductStock> viewProductStock() {
		return pdao.findAll();
	}

	@Override
	public ProductStock modifyProductStock(ProductStock p) {
		  ProductStock ps = pdao.findById(p.getProductId()).get();
		  if(ps!=null)
		  {
			  ps.setManufacturingDate(p.getManufacturingDate());
			  ps.setExpiryDate(p.getExpiryDate());
			  ps.setPricePerUnit(p.getPricePerUnit());
			  ps.setQuantityUnit(p.getQuantityUnit());
			  
		  }
		  return pdao.save(ps);
	}

	@Override
	public void deleteProductStock(int productId) {
		
		pdao.deleteById(productId);
	}

}
