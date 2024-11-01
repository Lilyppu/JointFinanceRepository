package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.TrMstCpersons;
import com.JointFinance.Repository.ITrMstCpersons;

@Service
public class ServiceTrMstCpersons {
	@Autowired
	ITrMstCpersons repoTMCP;
	
	public List<TrMstCpersons> getTmcpAll(){
		return repoTMCP.findAll();
	}
	
	public Optional<TrMstCpersons> getTmcpCode(String cpcode){
		return repoTMCP.findByTmcpCode(cpcode);
	}
}
