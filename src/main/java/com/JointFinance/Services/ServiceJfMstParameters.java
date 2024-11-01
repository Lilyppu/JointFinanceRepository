package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfMstParameters;
import com.JointFinance.Repository.IJfMstParametersRepository;

@Service

public class ServiceJfMstParameters {
	@Autowired
	IJfMstParametersRepository repoJmp;
	
	public List<JfMstParameters> getJmpAll(){
		return repoJmp.findAll();
	}
	
	public List<JfMstParameters> getJmpByPcode(String code){
		return repoJmp.findByJmpParamCodeContaining(code);
	}
	
	public List<JfMstParameters> getJmpByPname(String pname){
		return repoJmp.findByJmpParamNameContaining(pname);
	}
	
	public List<JfMstParameters> getJmpByPdesc(String desc){
		return repoJmp.findByJmpDescriptionContaining(desc);
	}
	
	public Optional<JfMstParameters> getJmpSingle(String code){
		return repoJmp.findByJmpParamCode(code);
	}
	
	public String saveUpdateJfMstParam(JfMstParameters jmstparam) {
		repoJmp.save(jmstparam);
		return "Submit Successfully";
	}
	

}
