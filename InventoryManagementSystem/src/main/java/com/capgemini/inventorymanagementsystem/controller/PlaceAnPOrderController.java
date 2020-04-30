package com.capgemini.inventorymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.entities.PlaceAnPOrder;
import com.capgemini.inventorymanagementsystem.service.PlaceAnPOrderService;

@RestController
@RequestMapping("/placeporder")
public class PlaceAnPOrderController {

	@Autowired    
	PlaceAnPOrderService placeservice;
	
	public void setPlaceAnPOrderService(PlaceAnPOrderService placeservice) {
		this.placeservice = placeservice;
	}
	
	@PostMapping(value = "/placeanporder")
	public PlaceAnPOrder placePorder (@RequestBody PlaceAnPOrder plp)
	{
		return placeservice.placePOrder(plp);
	}

}
