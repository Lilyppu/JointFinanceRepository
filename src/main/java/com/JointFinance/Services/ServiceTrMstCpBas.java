package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.TrMstCpBas;
import com.JointFinance.Repository.ITrMstCpBasRepository;

@Service
public class ServiceTrMstCpBas {
	@Autowired
	ITrMstCpBasRepository repoTMCB;
	
	public List<TrMstCpBas> getTmcbAll(){
		return repoTMCB.findAll();
	}
	
	public List<TrMstCpBas> getTmcbBankName(String bankname){
		return repoTMCB.findByTmcbBankName(bankname);
	}
	
	public Optional<TrMstCpBas> getTmcbAccountNo(String accountno){
		return repoTMCB.findByTmcbAccountNo(accountno);
	}
	
	public String saveUpdateTmcb(TrMstCpBas tmcb) {
		repoTMCB.save(tmcb);
		return "Submit Successfully";
	}
}
