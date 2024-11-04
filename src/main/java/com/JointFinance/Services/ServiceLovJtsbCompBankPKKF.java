package com.JointFinance.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.LovJtsbCompBankPKKF;
import com.JointFinance.Repository.ILovJtsbCompBankPKKFRepository;

@Service

public class ServiceLovJtsbCompBankPKKF {
	@Autowired
	ILovJtsbCompBankPKKFRepository repoPKKF;
	
	public List<LovJtsbCompBankPKKF> getLovJtscBankPKKF(String cpcode){
		return repoPKKF.findByLovJtsbBankPkkfCpCodeContaining(cpcode);
	}

}
