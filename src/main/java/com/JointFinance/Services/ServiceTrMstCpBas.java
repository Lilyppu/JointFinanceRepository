package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.TrMstCpBas;
import com.JointFinance.Repository.ITrMstCpBas;

@Service
public class ServiceTrMstCpBas {
	@Autowired
	ITrMstCpBas repoTMCB;
	
	public List<TrMstCpBas> getTmcbAll(){
		return repoTMCB.findAll();
	}
	
	public Optional<TrMstCpBas> getTmcbBankName(String bankname){
		return repoTMCB.findByTmcbBankName(bankname);
	}
	
	public Optional<TrMstCpBas> getTmcbAccountNo(String accountno){
		return repoTMCB.findByTmcbAccountNo(accountno);
	}
}
