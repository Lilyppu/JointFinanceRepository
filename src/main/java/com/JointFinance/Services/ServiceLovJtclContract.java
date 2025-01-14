package com.JointFinance.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.LovJtclContract;
import com.JointFinance.Repository.ILovJtclContractRepository;

@Service
public class ServiceLovJtclContract {
	@Autowired
	ILovJtclContractRepository repoJTCL;
	
	public List<LovJtclContract> getJtclAll(){
		return repoJTCL.findAll();
	}
}
