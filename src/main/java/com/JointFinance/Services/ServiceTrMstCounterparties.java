package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.TrMstCounterparties;
import com.JointFinance.Repository.ITrMstCounterpartiesRepository;

@Service
public class ServiceTrMstCounterparties {
	@Autowired
	ITrMstCounterpartiesRepository repoTMC;
	
	public List<TrMstCounterparties> getTmcAll(){
		return repoTMC.findAll();
	}
	
	public Optional<TrMstCounterparties> getTmcSingle(String cpcode){
		return repoTMC.findByTmcCpCode(cpcode);
	}
	
	public List<TrMstCounterparties> getTmcCpCodeList(String cpcode){
		return repoTMC.findByTmcCpCodeContaining(cpcode);
	}
	
	public String saveUpdateTmc(TrMstCounterparties tmc){
		repoTMC.save(tmc);
		 return "Submit Successfully";
	}
}
