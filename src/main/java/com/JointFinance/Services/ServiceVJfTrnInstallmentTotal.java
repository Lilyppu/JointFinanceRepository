package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfTrnInstallmentTotal;
import com.JointFinance.Repository.IVJfTrnInstallmentsTotalRepository;

@Service
public class ServiceVJfTrnInstallmentTotal {
	@Autowired
	IVJfTrnInstallmentsTotalRepository repoVJTIT;
	
	public Optional<VJfTrnInstallmentTotal> getVjtitByContractNoCU(String contractno){
		return repoVJTIT.findByVjtitContractNo(contractno);
	}
}
