package com.capgemini.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.entities.ProductStock;
import com.capgemini.inventorymanagementsystem.service.ProductStockService;

@RestController
@RequestMapping("/productstock")
@CrossOrigin("http://localhost:4200")
public class ProductStockController {

	@Autowired
	ProductStockService stockservice;
	
	
	@PostMapping(value = "/addproductstock")
	public ProductStock addProductStock (@RequestBody ProductStock p)
	{
		return stockservice.addProductStock(p);		
	}
	
	@GetMapping(value="/getallproducts",produces="application/json")
    public List<ProductStock> viewProductStock()
    {
   	 return stockservice.viewProductStock();
    }
	
}