package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.TrMstCpersons;
import com.JointFinance.Repository.ITrMstCpersonsRepository;

@Service
public class ServiceTrMstCpersons {
	@Autowired
	ITrMstCpersonsRepository repoTMCP;
	
	public List<TrMstCpersons> getTmcpAll(){
		return repoTMCP.findAll();
	}
	
	public Optional<TrMstCpersons> getTmcpCpCode(String cpcode){
		return repoTMCP.findByTmcpCpCode(cpcode);
	}
	
	public List<TrMstCpersons> getTmcpBranchId(Integer branchid){
		return repoTMCP.findByTmcpBranchId(branchid);
	}
}
