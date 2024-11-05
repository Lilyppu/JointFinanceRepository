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
	
	public List<TrMstBaRoles> getTmbrBankName(String bankname){
		return repoTMBR.findByTmbrBankName(bankname);
	}
	
	public List<TrMstBaRoles> getTmbrAccountNo(String bankname){
		return repoTMBR.findByTmbrAccountNo(bankname);
	}
	
	public List<TrMstBaRoles> getTmbrCpCode(String cpcode){
		return repoTMBR.findByTmbrCpCode(cpcode);
	}
	
	public List<TrMstBaRoles> getTmbrBranchId(Integer branchid){
		return repoTMBR.findByTmbrBranchId(branchid);
	}
	
	public List<TrMstBaRoles> getTmbrRoleCode(String rolecode){
		return repoTMBR.findByTmbrRoleCode(rolecode);
	}
}
