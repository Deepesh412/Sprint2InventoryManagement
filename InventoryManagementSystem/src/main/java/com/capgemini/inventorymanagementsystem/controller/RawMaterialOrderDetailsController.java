package com.capgemini.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.entities.PlaceAnRMOrder;
import com.capgemini.inventorymanagementsystem.entities.RawMaterialOrderDetails;
import com.capgemini.inventorymanagementsystem.entities.RawMaterialStock;
import com.capgemini.inventorymanagementsystem.service.RawMaterialOrderDetailsService;

@RestController
@RequestMapping("/rawmaterialorderdetails")
public class RawMaterialOrderDetailsController {

	@Autowired
	RawMaterialOrderDetailsService orderservice;
	
	@PostMapping(value = "/addrawmaterialorderdetails")
	public RawMaterialOrderDetails addRawMaterialOrderDetails (@RequestBody RawMaterialOrderDetails rmo, PlaceAnRMOrder plo, RawMaterialStock rms)
	{
		return orderservice.addRawMaterialOrderDetails(rmo, plo, rms);		
	}
	
	
	@GetMapping(value="/getrawmaterialorderdetails/{orderId}",produces="application/json")
    public RawMaterialOrderDetails viewRawMaterialOrderDetails(@PathVariable int orderId)
    {
   	 return orderservice.viewRawMaterialOrderDetails(orderId);
    }
	
	
	@GetMapping(value="/getallrawmaterialorderdetails",produces="application/json")
    public List<RawMaterialOrderDetails> viewRawMaterialOrderDetails()
    {
   	 return orderservice.viewRawMaterialOrderDetails();
    }
	
	
/*	 @DeleteMapping("/deleterawmaterialorderdetail/{orderId}")
     public String deleteRawMaterialOrderDetails(@PathVariable int orderId)
     {
    	 orderservice.deleteRawMaterialOrderDetails(orderId);
    	 return "RawMaterial order Details Deleted";
     }
    
	 
     @PutMapping("/updaterawmaterialorderdetails")
     public RawMaterialOrderDetails modifyRawMaterialOrderDetails(@RequestBody RawMaterialOrderDetails rmo,PlaceAnRMOrder plo)
     {
    	 return orderservice.modifyRawMaterialOrderDetails(rmo, plo);
     }*/
}

