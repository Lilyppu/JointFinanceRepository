package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfOthersInfoSold;
import com.JointFinance.Repository.IVJfOthersInfoSoldRepository;

@Service
public class ServiceVJfOthersInfoSold {
	@Autowired
	IVJfOthersInfoSoldRepository repoVJOIS;
	
	public List<VJfOthersInfoSold> getVjoisAll(){
		return repoVJOIS.findAll();
	}
	
	public Optional<VJfOthersInfoSold> getVjoiBySoldContractNoCU(String contractno){
		return repoVJOIS.findByVjoiSoldContractNo(contractno);
	}
}
