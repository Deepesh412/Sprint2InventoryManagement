package com.capgemini.inventorymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.entities.PlaceAnRMOrder;
import com.capgemini.inventorymanagementsystem.service.PlaceAnRMOrderService;


@RestController
@RequestMapping("/placermorder")
public class PlaceAnRMOrderController {

	@Autowired    
	PlaceAnRMOrderService placeservice;
	
	public void setPlaceAnRMOrderService(PlaceAnRMOrderService placeservice) {
		this.placeservice = placeservice;
	}
	
	@PostMapping(value = "/placeanorder")
	public PlaceAnRMOrder PlaceRMorder (@RequestBody PlaceAnRMOrder plo)
	{
		return placeservice.PlaceRMorder(plo);	
	}

}
