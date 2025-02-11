package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfApplInfoMemoDate;
import com.JointFinance.Repository.IVJfApplInfoMemoDateRepository;

@Service
public class ServiceVJfApplInfoMemoDate {
	@Autowired
	IVJfApplInfoMemoDateRepository repoVJAIMD;
	
	public List<VJfApplInfoMemoDate> getVjaimdAll(){
		return repoVJAIMD.findAll();
	}
	
	public Optional<VJfApplInfoMemoDate> getVjaimdByContractNoCU(String contractno){
		return repoVJAIMD.findByVjaimdContractNo(contractno);
	}
}
