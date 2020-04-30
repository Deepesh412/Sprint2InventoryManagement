package com.capgemini.inventorymanagementsystem.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagementsystem.dao.PlaceAnPOrderRepository;
import com.capgemini.inventorymanagementsystem.entities.PlaceAnPOrder;

@Service
@Transactional
public class PlaceAnPOrderServiceImpl implements PlaceAnPOrderService {

	@Autowired
	PlaceAnPOrderRepository plodao;

	@Override
	public PlaceAnPOrder placePOrder(PlaceAnPOrder plp) {
		
		
		return plodao.save(plp);
	}
	
	
	
}
