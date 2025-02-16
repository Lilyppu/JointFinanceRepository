package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfOthersInfoAyd;
import com.JointFinance.Repository.IVJfOthersInfoAydRepository;

@Service
public class ServiceVJfOthersInfoAyd {
	@Autowired
	IVJfOthersInfoAydRepository repoVJOIA;
	
	public List<VJfOthersInfoAyd> getVjoiaAll(){
		return repoVJOIA.findAll();
	}
	
	public Optional<VJfOthersInfoAyd> getVjoiByAydContractNoCU(String contractno){
		return repoVJOIA.findByVjoiAydContractNo(contractno);
	}
}
