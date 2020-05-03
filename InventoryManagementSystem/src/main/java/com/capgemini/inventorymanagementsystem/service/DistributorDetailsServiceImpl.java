package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagementsystem.dao.DistributorDetailsRepository;
import com.capgemini.inventorymanagementsystem.entities.DistributorDetails;

@Service
@Transactional
public class DistributorDetailsServiceImpl implements DistributorDetailsService {

	@Autowired
	DistributorDetailsRepository ddao;
	
	@Override
	public DistributorDetails addDistributorDetails(DistributorDetails distributordetails) {
		return ddao.save(distributordetails);	
	}

	@Override
	public DistributorDetails viewDistributorDetailsById(int distributorId) {
		return ddao.findById(distributorId).get();
	}

	@Override
	public List<DistributorDetails> viewDistributorDetails() {
		return ddao.findAll();
	}

}
