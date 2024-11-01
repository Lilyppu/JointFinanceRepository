package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.TrMstBaRoles;
import com.JointFinance.Repository.ITrMstBaRoles;

@Service
public class ServiceTrMstBaRoles {
	@Autowired
	ITrMstBaRoles repoTMBR;
	
	public List<TrMstBaRoles> getTmbrAll(){
		return repoTMBR.findAll();
	}
	
	public Optional<TrMstBaRoles> getTmbrBankName(String bankname){
		return repoTMBR.findByTmbrBankName(bankname);
	}
	
	public Optional<TrMstBaRoles> getTmbrAccountNo(String bankname){
		return repoTMBR.findByTmbrAccountNo(bankname);
	}
	
	public Optional<TrMstBaRoles> getTmbrCpCode(String cpcode){
		return repoTMBR.findByTmbrCpCode(cpcode);
	}
	
	public Optional<TrMstBaRoles> getTmbrBranchId(Integer branchid){
		return repoTMBR.findByTmbrBranchId(branchid);
	}
	
	public Optional<TrMstBaRoles> getTmbrRoleCode(String rolecode){
		return repoTMBR.findByTmbrRoleCode(rolecode);
	}
}
