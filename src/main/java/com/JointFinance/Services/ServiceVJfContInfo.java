package com.JointFinance.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfContInfo;
import com.JointFinance.Repository.IVJfContInfoRepository;

@Service
public class ServiceVJfContInfo {
	@Autowired
	IVJfContInfoRepository repoVJCI;
	
	public List<VJfContInfo> getVjciAll(){
		return repoVJCI.findAll();
	}
	
	public Optional<VJfContInfo> getVjciByContractNoCU(String contractno){
		return repoVJCI.findByVjciContractNo(contractno);
	}
}
