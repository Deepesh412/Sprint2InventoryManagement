package com.capgemini.inventorymanagementsystem.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagementsystem.dao.RawMaterialOrderDetailsRepository;
import com.capgemini.inventorymanagementsystem.entities.PlaceAnRMOrder;
import com.capgemini.inventorymanagementsystem.entities.RawMaterialOrderDetails;
import com.capgemini.inventorymanagementsystem.entities.RawMaterialStock;

@Service
@Transactional
public class RawMaterialOrderDetailsServiceImpl implements RawMaterialOrderDetailsService {

	@Autowired
	RawMaterialOrderDetailsRepository rdao;
	
	
	@Override
	public RawMaterialOrderDetails addRawMaterialOrderDetails(RawMaterialOrderDetails rmo, PlaceAnRMOrder plo, RawMaterialStock r) {
		int quan = plo.getQuantityUnit();
		double unitprice = r.getPricePerUnit();
		rmo.setTotalPrice(unitprice*quan);
		
		rmo.setPricePerUnit(r.getPricePerUnit());
		Date dateofOrder = new Date();
		Date dateofOrder1 = new Date(dateofOrder.getTime());
		rmo.setOrderDate(dateofOrder1);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateofOrder);
		cal.add(Calendar.DATE,4);
		Date modifiedDate  = cal.getTime();
		Date dateofdel = new Date(modifiedDate.getTime());
		rmo.setDeliveryDate(dateofdel);
		
		rmo.setItemname(plo);
		rmo.setDeliveryStatus("Not dispatched");
		rmo.setQuantityunit(plo);
		
		return rdao.save(rmo);
	}

	@Override
	public RawMaterialOrderDetails viewRawMaterialOrderDetails(int orderId) {
		
		return rdao.findById(orderId).get();
	}

	@Override
	public List<RawMaterialOrderDetails> viewRawMaterialOrderDetails() {
		
		return rdao.findAll();
	}

/*	@Override
	public RawMaterialOrderDetails modifyRawMaterialOrderDetails(RawMaterialOrderDetails rmo, PlaceAnRMOrder plo) {
		
		RawMaterialOrderDetails rm = rdao.findById(rmo.getOrderId()).get();
		if(rm!=null)
		{
			int quan = plo.getQuantityUnit();
			double unit = rmo.getPricePerUnit();
			rmo.setTotalPrice(quan*unit);
			
			rm.setDeliveryDate(rmo.getDeliveryDate());
			rm.setOrderDate(rmo.getOrderDate());
			rm.setDeliveryStatus(rmo.getDeliveryStatus());
		
		}
		
		return rdao.save(rm);
	}

	@Override
	public void deleteRawMaterialOrderDetails(int orderId) {

		rdao.deleteById(orderId);
	}
*/
	

}
