package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfMstParameterOprs;
import com.JointFinance.Repository.IJfMstParameterOprsRepository;

@Service

public class ServiceJfMstParameterOprs {
	@Autowired
	IJfMstParameterOprsRepository repoJmpo;
	
	public List<JfMstParameterOprs> getJmpoByPcode(String code){
		return repoJmpo.findByJmpoParamCode(code);
	}
	
	public Optional<JfMstParameterOprs> getJmpoSingle(String code, String oprs){
		return repoJmpo.findByJmpoParamCodeAndJmpoOprSign(code, oprs);
	}
	
	public String saveUpdateJfMstParamOprs(JfMstParameterOprs jmstparamoprs) {
		repoJmpo.save(jmstparamoprs);
		return "Submit Successfully";
	}

}
