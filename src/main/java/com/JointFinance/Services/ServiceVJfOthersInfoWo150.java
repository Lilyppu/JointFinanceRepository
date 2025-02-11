package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfOthersInfoWo150;
import com.JointFinance.Repository.IVJfOthersInfoWo150Repository;

@Service
public class ServiceVJfOthersInfoWo150 {
	@Autowired
	IVJfOthersInfoWo150Repository repoVJOIW;
	
	public List<VJfOthersInfoWo150> getVjoiwAll(){
		return repoVJOIW.findAll();
	}
	
	public Optional<VJfOthersInfoWo150> getVjoiByWo150ContractNoCU(String contractno){
		return repoVJOIW.findByVjoiWo150ContractNo(contractno);
	}
}
