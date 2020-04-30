package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagementsystem.dao.ProductOrderDetailsRepository;
import com.capgemini.inventorymanagementsystem.entities.ProductOrderDetails;

@Service
@Transactional

public class ProductOrderDetailsServiceImpl implements ProductOrderDetailsService {

	@Autowired
	ProductOrderDetailsRepository pdao;
	
	@Override
	public ProductOrderDetails addProductOrderDetails(ProductOrderDetails po) {
		
		return pdao.save(po);
	}

	@Override
	public ProductOrderDetails viewProductOrderDetails(int orderId) {
		
		return pdao.findById(orderId).get();
	}

	@Override
	public List<ProductOrderDetails> viewProductOrderDetails() {
		
		return pdao.findAll();
	}

	@Override
	public ProductOrderDetails modifyProductOrderDetails(ProductOrderDetails po) {
		
		ProductOrderDetails pd = pdao.findById(po.getOrderId()).get();
		if(pd!=null)
		{
			pd.setDeliveryDate(po.getDeliveryDate());
			pd.setOrderDate(po.getOrderDate());
			pd.setDeliveryStatus(po.getDeliveryStatus());
			pd.setPricePerUnit(po.getPricePerUnit());
			pd.setQuantityUnit(po.getQuantityUnit());
			pd.setTotalPrice(po.getTotalPrice());
		}
		
		return pdao.save(pd);
	}

	@Override
	public void deleteProductOrderDetails(int orderId) {

		pdao.deleteById(orderId);
	}

}
