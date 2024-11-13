package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.TrMstCounterpartiesAndCpBranch;
import com.JointFinance.Repository.ITrMstCounterpartiesAndCpBranchRepository;
@Service
public class ServiceTrMstCounterpartiesAndCpBranch {

	@Autowired
	ITrMstCounterpartiesAndCpBranchRepository repoTMCACB;
	
	public List<TrMstCounterpartiesAndCpBranch> getTmcacbByCpCode(String pCp){
		return repoTMCACB.getTmcacbByCpCode(pCp);
	}
}