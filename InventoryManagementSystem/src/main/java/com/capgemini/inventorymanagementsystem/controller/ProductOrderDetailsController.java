package com.capgemini.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.entities.ProductOrderDetails;
import com.capgemini.inventorymanagementsystem.entities.ProductStock;
import com.capgemini.inventorymanagementsystem.exceptions.UnsuccessfulOrderException;
import com.capgemini.inventorymanagementsystem.service.ProductOrderDetailsService;

@RestController
@RequestMapping("/productorderdetails")
//@CrossOrigin("http://localhost:4200")
public class ProductOrderDetailsController {

	@Autowired
	ProductOrderDetailsService orderservice;
	
	@PostMapping(value = "/addproductorderdetails/{productId}")
	public ResponseEntity<String> addProductOrderDetails(@RequestBody ProductOrderDetails po, @PathVariable int productId)
	{
		ProductOrderDetails pro = orderservice.addProductOrderDetails(po, productId);
		if(pro == null) {
			throw new UnsuccessfulOrderException("Onsuccessful in creating order");
		}
		else
		{
			return new ResponseEntity<String>("placed order successfully",new HttpHeaders(),HttpStatus.OK);
		}
	}
	
	
	@GetMapping(value="/getproductorderdetails/{orderId}",produces="application/json")
    public ProductOrderDetails viewProductOrderDetails(@PathVariable int orderId)
    {
   	 return orderservice.viewProductOrderDetailsById(orderId);
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

