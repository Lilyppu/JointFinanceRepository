package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.TrMstCounterparties;
import com.JointFinance.Repository.ITrMstCounterparties;

@Service
public class ServiceTrMstCounterparties {
	@Autowired
	ITrMstCounterparties repoTMC;
	
	public List<TrMstCounterparties> getTmcAll(){
		return repoTMC.findAll();
	}
	
	public Optional<TrMstCounterparties> getTmcSingle(String cpcode){
		return repoTMC.findByTmcCpCode(cpcode);
	}
	
}
