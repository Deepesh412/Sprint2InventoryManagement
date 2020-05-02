package com.capgemini.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.inventorymanagementsystem.entities.RawMaterialOrderDetails;
import com.capgemini.inventorymanagementsystem.exceptions.UnsuccessfulOrderException;
import com.capgemini.inventorymanagementsystem.service.RawMaterialOrderDetailsService;

@RestController
@RequestMapping("/rawmaterialorderdetails")
public class RawMaterialOrderDetailsController {

	@Autowired
	RawMaterialOrderDetailsService orderservice;
	
	@PostMapping(value = "/placerawmaterialorder")
	public ResponseEntity<String> addRawMaterialOrderDetails(@RequestBody RawMaterialOrderDetails rmo)
	{	
		RawMaterialOrderDetails raw = orderservice.addRawMaterialOrderDetails(rmo);
		if(raw == null) {
			throw new UnsuccessfulOrderException("Unsuccessful in creating order");
		}
		else
		{
			return new ResponseEntity<String>("placed orders successfully",new HttpHeaders(),HttpStatus.OK);
		}
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

