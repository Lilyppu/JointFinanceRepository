package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnInstallments;
import com.JointFinance.Repository.IJfTrnInstallmentsRepository;

@Service
public class ServiceJfTrnInstallments {
	@Autowired
	IJfTrnInstallmentsRepository repoJTIS;
	
	public List<JfTrnInstallments> getJtisAll(){
		return repoJTIS.findAll();
	}
	
	public List<JfTrnInstallments> getByJtisSofCodeAndJtisContractNoList(String sofcode, String contractno){
		return repoJTIS.findByJtisSofCodeAndJtisContractNoOrderByJtisInstNoAsc(sofcode, contractno);
	}
	
	public List<JfTrnInstallments> getByJtisContractNoList(String contractno){
		return repoJTIS.findByJtisContractNoOrderByJtisInstNoAsc(contractno);
	}
}
