package com.capgemini.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.entities.SupplierDetails;
import com.capgemini.inventorymanagementsystem.service.SupplierDetailsService;

@RestController
@RequestMapping("/supplier")
public class SupplierDetailsController {
	
	@Autowired
	SupplierDetailsService supplierservice;

	@PostMapping(value = "/addsupplierdetails")
	public SupplierDetails addSupplierDetails (@RequestBody SupplierDetails s)
	{
		return supplierservice.addSupplierDetails(s);		
	}
	
	@GetMapping(value="/getsuppierdetails/{supplierId}",produces="application/json")
    public SupplierDetails viewSupplierDetails(@PathVariable int supplierId)
    {
   	 return supplierservice.viewSupplierDetails(supplierId);
    }
	
	@GetMapping(value="/getallsupplierdetails",produces="application/json")
    public List<SupplierDetails> viewSupplierDetails()
    {
   	 return supplierservice.viewSupplierDetails();
    }
}
	

