package com.JointFinance.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.LovJtsbCompBankP4B;
import com.JointFinance.Repository.ILovJtsbCompBankP4BRepository;

@Service

public class ServiceLovJtsbCompBankP4B {
	@Autowired
	ILovJtsbCompBankP4BRepository repoP4b;
	
	public List<LovJtsbCompBankP4B> getJtscBankP4B(String cpcode){
		return repoP4b.findByLovJtsbCpCodeContaining(cpcode);
	}
}
