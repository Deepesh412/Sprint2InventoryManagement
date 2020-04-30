package com.capgemini.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.entities.PlaceAnPOrder;
import com.capgemini.inventorymanagementsystem.entities.ProductOrderDetails;
import com.capgemini.inventorymanagementsystem.entities.ProductStock;
import com.capgemini.inventorymanagementsystem.service.ProductOrderDetailsService;

@RestController
@RequestMapping("/productorderdetails")
public class ProductOrderDetailsController {

	@Autowired
	ProductOrderDetailsService orderservice;
	
	@PostMapping(value = "/addproductorderdetails")
	public ProductOrderDetails addProductOrderDetails (@RequestBody ProductOrderDetails po, ProductStock p, PlaceAnPOrder plp)
	{
		return orderservice.addProductOrderDetails(po,p,plp);		
	}
	
	
	@GetMapping(value="/getproductorderdetails/{orderId}",produces="application/json")
    public ProductOrderDetails viewProductOrderDetails(@PathVariable int orderId)
    {
   	 return orderservice.viewProductOrderDetails(orderId);
    }
	
	
	@GetMapping(value="/getallproductorderdetails",produces="application/json")
    public List<ProductOrderDetails> viewProductOrderDetails()
    {
   	 return orderservice.viewProductOrderDetails();
    }
	
	
	/* @DeleteMapping("/deleterawmaterialorderdetail/{orderId}")
     public String deleteProductOrderDetails(@PathVariable int orderId)
     {
    	 orderservice.deleteProductOrderDetails(orderId);
    	 return "product order Details Deleted";
     }
    
	 
     @PutMapping("/updateproductorderdetails")
     public ProductOrderDetails modifyProductOrderDetails(@RequestBody ProductOrderDetails po)
     {
    	 return orderservice.modifyProductOrderDetails(po);
     }*/
}

