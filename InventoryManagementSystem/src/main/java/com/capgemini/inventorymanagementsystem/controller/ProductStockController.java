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

import com.capgemini.inventorymanagementsystem.entities.ProductStock;
import com.capgemini.inventorymanagementsystem.service.ProductStockService;

@RestController
@RequestMapping("/productstock")
public class ProductStockController {

	@Autowired
	ProductStockService stockservice;
	
	
	@PostMapping(value = "/addproductstock")
	public ProductStock addProductStock (@RequestBody ProductStock p)
	{
		return stockservice.addProductStock(p);		
	}
	
	@GetMapping(value="/getproductstock/{productId}",produces="application/json")
    public ProductStock viewProductStock(@PathVariable int productId)
    {
   	 return stockservice.viewProductStock(productId);
    }
	
	@GetMapping(value="/getallproducts",produces="application/json")
    public List<ProductStock> viewProductStock()
    {
   	 return stockservice.viewProductStock();
    }
	
	 @DeleteMapping("/deleteproduct/{productId}")
     public String deleteProductStock(@PathVariable int productId)
     {
    	 stockservice.deleteProductStock(productId);
    	 return "Product stock Details Deleted";
     }
     
     @PutMapping("/updateproductstock")
     public ProductStock modifyProductStock(@RequestBody ProductStock p)
     {
    	 return stockservice.modifyProductStock(p);
     }
	
}