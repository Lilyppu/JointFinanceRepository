package com.JointFinance.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfApplInfo;
import com.JointFinance.Repository.IVJfApplInfoRepository;

@Service
public class ServiceJfApplInfo {
	@Autowired
	IVJfApplInfoRepository repoVJAI;
	
	public List<VJfApplInfo> getVjaiAll(){
		return repoVJAI.findAll();
	}
	
	public Optional<VJfApplInfo> getVjaiByContractNoCU(String contractno){
		return repoVJAI.findByVjaiContractNo(contractno);
	}
}
