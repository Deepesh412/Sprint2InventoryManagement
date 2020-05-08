package com.capgemini.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.entities.RawMaterialStock;
import com.capgemini.inventorymanagementsystem.service.RawMaterialStockService;

@RestController
@RequestMapping("/rawmaterialstock")
@CrossOrigin("http://localhost:4200")
public class RawMaterialStockcontroller {

	@Autowired
	RawMaterialStockService stockservice;
	
	@PostMapping(value = "/addrawmaterialstock")
	public RawMaterialStock addRawMaterialStock (@RequestBody RawMaterialStock r)
	{
		return stockservice.addRawMaterialStock(r);		
	}
	
	
	@GetMapping(value="/getallrawmaterials",produces="application/json")
    public List<RawMaterialStock> viewRawMaterialStock()
    {
   	 return stockservice.viewRawMaterialStock();
    }
		
}
