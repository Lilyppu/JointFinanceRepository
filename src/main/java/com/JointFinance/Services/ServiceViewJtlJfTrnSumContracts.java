package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.ViewJtlJfTrnSumContracts;
import com.JointFinance.Repository.IViewJtlJfTrnSumContractsRepository;

@Service
public class ServiceViewJtlJfTrnSumContracts {
	
	@Autowired
	IViewJtlJfTrnSumContractsRepository repoJTLJTSC;
	
	public List<ViewJtlJfTrnSumContracts> getJtlJtscList1(String pSofCode, String pLetterNo){
		return repoJTLJTSC.getJtlJtscList1(pSofCode, pLetterNo);
	}
	
	public List<ViewJtlJfTrnSumContracts> getJtlJtscList2(String pSofCode, String pLetterNo){
		return repoJTLJTSC.getJtlJtscList2(pSofCode, pLetterNo);
	}

}
