package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfOthersInfo;
import com.JointFinance.Repository.IVJfOthersInfoRepository;

@Service
public class ServiceVJfOthersInfo {
	@Autowired
	IVJfOthersInfoRepository repoVJOI;
	
	public List<VJfOthersInfo> getVjoiAll(){
		return repoVJOI.findAll();
	}
	
	public Optional<VJfOthersInfo> getVjoiByPbContractNoCU(String contractno){
		return repoVJOI.findByVjoiPbContractNo(contractno);
	}
}
