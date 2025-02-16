package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfOthersInfoBuyback;
import com.JointFinance.Repository.IVJfOthersInfoBuybackRepository;

@Service
public class ServiceVJfOthersInfoBuyback {
	@Autowired
	IVJfOthersInfoBuybackRepository repoVJOIB;
	
	public List<VJfOthersInfoBuyback> getVjoibAll(){
		return repoVJOIB.findAll();
	}
	
	public Optional<VJfOthersInfoBuyback> getVjoiBuybackContractNoCU(String contractno){
		return repoVJOIB.findByVjoiBuybackContractNo(contractno);
	}
}
