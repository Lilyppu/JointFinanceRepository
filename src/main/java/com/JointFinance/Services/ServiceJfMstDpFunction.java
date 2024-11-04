package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfMstDpFunction;
import com.JointFinance.Models.JfTrnSofAddedums;
import com.JointFinance.Repository.IJfMstDpFunctionRepository;
import com.JointFinance.Repository.IJfTrnSofAddedumsRepository;

@Service
public class ServiceJfMstDpFunction {
	@Autowired
	IJfMstDpFunctionRepository repoJMDF;
	
	public List<JfMstDpFunction> getDpFuncList(){
		return repoJMDF.findAll();
	}

}
