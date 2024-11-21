package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.TrMstCpRoles;
import com.JointFinance.Repository.ITrMstCpRolesRepository;

@Service
public class ServiceTrMstCpRoles {
	@Autowired
	ITrMstCpRolesRepository repoTMCR;
	
	public List<TrMstCpRoles> getTmcrAll(){
		return repoTMCR.findAll();
	}
	
	public List<TrMstCpRoles> getTmcrCpCode(String cpcode){
		return repoTMCR.findByTmcrCpCode(cpcode);
	}
	
	public List<TrMstCpRoles> getTmcrBranchId(Integer branchid){
		return repoTMCR.findByTmcrBranchId(branchid);
	}
	
	public List<TrMstCpRoles> getTmcrRoleCode(String rolecode){
		return repoTMCR.findByTmcrRoleCode(rolecode);
	}
	
	public List<TrMstCpRoles> getTmcrCpCodeAndTmcrBranchId(String cpcode, Integer branchid){
		return repoTMCR.findByTmcrCpCodeAndTmcrBranchId(cpcode, branchid);
	}
	
	public Optional<TrMstCpRoles> getTmcrCpCodeAndTmcrBranchIdAndTmcrRoleCode(String cpcode, Integer branchid, String rolecode){
		return repoTMCR.findByTmcrCpCodeAndTmcrBranchIdAndTmcrRoleCode(cpcode, branchid, rolecode);
	}
	
	public String saveUpdateTmcr(TrMstCpRoles tmcr) {
		repoTMCR.save(tmcr);
		return "Submit Successfully";
	}
}
