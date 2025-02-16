package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfOthersInfoInst;
import com.JointFinance.Repository.IVJfOthersInfoInstRepository;

@Service
public class ServiceVJfOthersInfoInst {
	@Autowired
	IVJfOthersInfoInstRepository repoVJOII;
	
	public List<VJfOthersInfoInst> getVjoiiAll(){
		return repoVJOII.findAll();
	}
	
	public Optional<VJfOthersInfoInst> getVjoiByInstContractNoCU(String contractno){
		return repoVJOII.findByVjoiInstContractNo(contractno);
	}
}
