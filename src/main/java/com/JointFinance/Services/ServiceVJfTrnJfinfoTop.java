package com.JointFinance.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfTrnJfinfoTop;
import com.JointFinance.Repository.IVJfTrnJfInfoTopRepository;

@Service
public class ServiceVJfTrnJfinfoTop {
	@Autowired
	IVJfTrnJfInfoTopRepository repoVJTJT;
	
	public List<VJfTrnJfinfoTop> getVjtjtAll(){
		return repoVJTJT.findAll();
	}
	
	public Optional<VJfTrnJfinfoTop> getVjtjtByContractNoCU(String contractno){
		return repoVJTJT.findByVjtjtContractNo(contractno);
	}
}
