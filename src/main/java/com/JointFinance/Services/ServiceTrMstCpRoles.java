package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.TrMstCpRoles;
import com.JointFinance.Repository.ITrMstCpRoles;

@Service
public class ServiceTrMstCpRoles {
	@Autowired
	ITrMstCpRoles repoTMCR;
	
	public List<TrMstCpRoles> getTmcrAll(){
		return repoTMCR.findAll();
	}
	
	public Optional<TrMstCpRoles> getTmcrCpCode(String cpcode){
		return repoTMCR.findByTmcrCpCode(cpcode);
	}
	
	public Optional<TrMstCpRoles> getTmcrBranchId(Integer branchid){
		return repoTMCR.findByTmcrBranchId(branchid);
	}
	
	public Optional<TrMstCpRoles> getTmcrRoleCode(String rolecode){
		return repoTMCR.findByTmcrRoleCode(rolecode);
	}
}
