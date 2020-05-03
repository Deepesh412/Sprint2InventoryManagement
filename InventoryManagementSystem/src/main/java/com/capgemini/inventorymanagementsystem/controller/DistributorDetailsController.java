package com.capgemini.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.entities.DistributorDetails;
import com.capgemini.inventorymanagementsystem.service.DistributorDetailsService;

@RestController
@RequestMapping("/distributor")
//@CrossOrigin("http://localhost:4200")
public class DistributorDetailsController {

	@Autowired
     DistributorDetailsService distributorservice;
	
	public void setDistributorDetailsService(DistributorDetailsService distributorservice) {
		this.distributorservice = distributorservice;
	}
	
	@PostMapping(value = "/adddistributordetails")
	public DistributorDetails addDistributorDetails (@RequestBody DistributorDetails distributordetails)
	{
		return distributorservice.addDistributorDetails(distributordetails);		
	}
	
	@GetMapping(value="/getdistributordetails/{distributorId}",produces="application/json")
    public DistributorDetails viewDistributorDetails(@PathVariable int distributorId)
    {
   	 return distributorservice.viewDistributorDetailsById(distributorId);
    }
	
	@GetMapping(value="/getalldistributordetails",produces="application/json")
    public List<DistributorDetails> viewDistributorDetails()
    {
   	 return distributorservice.viewDistributorDetails();
    }
}
	
