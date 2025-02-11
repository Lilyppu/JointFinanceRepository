package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfOthersInfoPreterm;
import com.JointFinance.Repository.IVJfOthersInfoPretermRepository;

@Service
public class ServiceVJfOthersInfoPreterm {
	@Autowired
	IVJfOthersInfoPretermRepository repoVJOIPR;
	
	public List<VJfOthersInfoPreterm> getVjoiprAll(){
		return repoVJOIPR.findAll();
	}
	
	public Optional<VJfOthersInfoPreterm> getVjoiByPretermContractNoCU(String contractno){
		return repoVJOIPR.findByVjoiPretermContractNo(contractno);
	}
}
