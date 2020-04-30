package com.capgemini.inventorymanagementsystem.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagementsystem.dao.ProductOrderDetailsRepository;
import com.capgemini.inventorymanagementsystem.entities.ProductOrderDetails;
import com.capgemini.inventorymanagementsystem.entities.ProductStock;

@Service
@Transactional

public class ProductOrderDetailsServiceImpl implements ProductOrderDetailsService {

	@Autowired
	ProductOrderDetailsRepository pdao;
	
	@Override
	public ProductOrderDetails addProductOrderDetails(ProductOrderDetails po, ProductStock p) {
		
		int quan = po.getQuantityUnit();
		double uniprice = p.getPricePerUnit();
		po.setTotalPrice(uniprice*quan);
		
		
		Date dateofOrder = new Date();
		Date dateofOrder1 = new Date(dateofOrder.getTime());
		po.setOrderDate(dateofOrder1);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateofOrder);
		cal.add(Calendar.DATE,4);
		Date modifiedDate  = cal.getTime();
		Date dateofdel = new Date(modifiedDate.getTime());
		po.setDeliveryDate(dateofdel);
		
	
		po.setDeliveryStatus("Not dispatched");
	
		
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

	
	/*@Override
	public ProductOrderDetails modifyProductOrderDetails(ProductOrderDetails po) {
		
		ProductOrderDetails pd = pdao.findById(po.getOrderId()).get();
		if(pd!=null)
		{
			pd.setDeliveryDate(po.getDeliveryDate());
			pd.setOrderDate(po.getOrderDate());
			pd.setDeliveryStatus(po.getDeliveryStatus());
			pd.setPricePerUnit(po.getPricePerUnit());
			pd.setQuantityUnit(po.getQuantityUnit());
			
		}
		
		return pdao.save(pd);
	}

	@Override
	public void deleteProductOrderDetails(int orderId) {

		pdao.deleteById(orderId);
	}*/

}
