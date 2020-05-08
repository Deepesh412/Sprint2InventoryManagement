package com.capgemini.inventorymanagementsystem.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagementsystem.dao.RawMaterialOrderDetailsRepository;
import com.capgemini.inventorymanagementsystem.entities.RawMaterialOrderDetails;

@Service
@Transactional
public class RawMaterialOrderDetailsServiceImpl implements RawMaterialOrderDetailsService {

	@Autowired
	RawMaterialOrderDetailsRepository rdao;
	
	
	@Override
	public RawMaterialOrderDetails addRawMaterialOrderDetails(RawMaterialOrderDetails rmo) {
	
		
		int quan = rmo.getQuantityUnit();
		double unit = rmo.getPricePerUnit();
		rmo.setTotalPrice(quan*unit);
		
		
		Date dateofOrder = new Date();
		Date dateofOrder1 = new Date(dateofOrder.getTime());
		rmo.setOrderDate(dateofOrder1);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateofOrder);
		cal.add(Calendar.DATE,4);
		Date modifiedDate  = cal.getTime();
		Date dateofdel = new Date(modifiedDate.getTime());
		rmo.setDeliveryDate(dateofdel);
		

		rmo.setDeliveryStatus("Not dispatched");
		
		
		return rdao.save(rmo);

	}

	@Override
	public RawMaterialOrderDetails viewRawMaterialOrderDetailsById(int orderId) {
		
		return rdao.findById(orderId).get();
	}

	@Override
	public List<RawMaterialOrderDetails> viewRawMaterialOrderDetails() {
		
		return rdao.findAll();
	}


}
