package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.TrMstCpBranches;
import com.JointFinance.Repository.ITrMstCpBranches;

@Service
public class ServiceTrMstCpBranches {
	@Autowired
	ITrMstCpBranches repoTMCBR;
	
	public List<TrMstCpBranches> getTmcbrAll(){
		return repoTMCBR.findAll();
	}
	
	public Optional<TrMstCpBranches> getTmcbrCpCode(String cpcode){
		return repoTMCBR.findByTmcbrCpCode(cpcode);
	}
	
	public Optional<TrMstCpBranches> getTmcbrBranchId(Integer branchid){
		return repoTMCBR.findByTmcbrBranchId(branchid);
	}
}
