package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagementsystem.dao.RawMaterialStockRepository;
import com.capgemini.inventorymanagementsystem.entities.RawMaterialStock;

@Service
@Transactional
public class RawMaterialStockServiceimpl implements RawMaterialStockService {

	@Autowired
	RawMaterialStockRepository rdao;
	
	@Override
	public RawMaterialStock addRawMaterialStock(RawMaterialStock r) {
		return rdao.save(r);
	}

	@Override
	public RawMaterialStock viewRawMaterialStock(int rawmaterialId) {
		return rdao.findById(rawmaterialId).get();
	}

	@Override
	public List<RawMaterialStock> viewRawMaterialStock() {
		return rdao.findAll();
	}

	@Override
	public RawMaterialStock modifyRawMaterialStock(RawMaterialStock r) {

		  RawMaterialStock rm = rdao.findById(r.getRawmaterialId()).get();
		  if(rm!=null)
		  {
			  rm.setManufacturingDate(r.getManufacturingDate());
	     	  rm.setExpiryDate(r.getExpiryDate());
	     	  rm.setPricePerUnit(r.getPricePerUnit());
		  }
		  return rdao.save(rm);
	  }

	@Override
	public void deleteRawMaterialStock(int rawmaterialId) {
		
		rdao.deleteById(rawmaterialId);
	}

}
