package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnInstallmentDtls;
import com.JointFinance.Repository.IJfTrnInstallmentDtlsRepository;

@Service
public class ServiceJfTrnInstallmentDtls {
	@Autowired
	IJfTrnInstallmentDtlsRepository repoJTID;
	
	public List<JfTrnInstallmentDtls> getJtidAll(){
		return repoJTID.findAll();
	}
	
	public List<JfTrnInstallmentDtls> getByJtidSofCodeAndJtidContractNoList(String sofcode, String contractno){
		return repoJTID.findByJtidSofCodeAndJtidContractNoOrderByJtidInstNoAsc(sofcode, contractno);
	}
	
	public List<JfTrnInstallmentDtls> getByJtidContractNoList(String contractno){
		return repoJTID.findByJtidContractNoOrderByJtidInstNoAsc(contractno);
	}
}
