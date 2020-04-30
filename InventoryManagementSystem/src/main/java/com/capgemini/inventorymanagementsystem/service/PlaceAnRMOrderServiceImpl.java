package com.capgemini.inventorymanagementsystem.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagementsystem.dao.PlaceAnRMOrderRepository;
import com.capgemini.inventorymanagementsystem.entities.PlaceAnRMOrder;

@Service
@Transactional
public class PlaceAnRMOrderServiceImpl implements PlaceAnRMOrderService {

	@Autowired
	PlaceAnRMOrderRepository pldao;
	
	
	@Override
	public PlaceAnRMOrder placeRMorder(PlaceAnRMOrder plo) {
		
		return pldao.save(plo);
	}

}