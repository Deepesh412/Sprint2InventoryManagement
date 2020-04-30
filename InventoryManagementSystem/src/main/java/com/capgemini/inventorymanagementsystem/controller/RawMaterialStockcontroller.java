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

import com.capgemini.inventorymanagementsystem.entities.RawMaterialStock;
import com.capgemini.inventorymanagementsystem.service.RawMaterialStockService;

@RestController
@RequestMapping("/rawmaterialstock")
public class RawMaterialStockcontroller {

	@Autowired
	RawMaterialStockService stockservice;
	
	@PostMapping(value = "/addrawmaterialstock")
	public RawMaterialStock addRawMaterialStock (@RequestBody RawMaterialStock r)
	{
		return stockservice.addRawMaterialStock(r);		
	}
	
	
	@GetMapping(value="/getrawmaterialstock/{rawMaterialId}",produces="application/json")
    public RawMaterialStock viewRawMaterialStock(@PathVariable int rawMaterialId)
    {
   	 return stockservice.viewRawMaterialStock(rawMaterialId);
    }
	
	
	@GetMapping(value="/getallrawmaterials",produces="application/json")
    public List<RawMaterialStock> viewRawMaterialStock()
    {
   	 return stockservice.viewRawMaterialStock();
    }
	
	
	 @DeleteMapping("/deleterawmaterial/{rawMaterialId}")
     public String deleteRawMaterialStock(@PathVariable int rawMaterialId)
     {
    	 stockservice.deleteRawMaterialStock(rawMaterialId);
    	 return "RawMaterial stock Details Deleted";
     }
    
	 
     @PutMapping("/updaterawmaterialstock")
     public RawMaterialStock modifyRawMaterialStock(@RequestBody RawMaterialStock r)
     {
    	 return stockservice.modifyRawMaterialStock(r);
     }
	
	
	
}
