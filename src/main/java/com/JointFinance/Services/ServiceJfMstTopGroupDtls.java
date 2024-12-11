package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfMstTopGroupDtls;
import com.JointFinance.Repository.IJfMstTopGroupDtlsRepository;

@Service
public class ServiceJfMstTopGroupDtls {
	@Autowired
	IJfMstTopGroupDtlsRepository repoJMTGD;
	
	public List<JfMstTopGroupDtls> getJmtgdAll(){
		return repoJMTGD.findAll();
	}
	
	public List<JfMstTopGroupDtls> getByJmtgdTopId(Integer topid){
		return repoJMTGD.findByJmtgdTopId(topid);
	}
	/*
	public Optional<JfMstTopGroupDtls> getJmpoSingle(String code, String oprs){
		return repoJMTGD.findByJmpoParamCodeAndJmpoOprSign(code, oprs);
	}
	*/
	
	public String saveUpdateJfMstTopGroupDtls(JfMstTopGroupDtls jmtgd) {
		repoJMTGD.save(jmtgd);
		return "Submit Successfully";
	}
	
	public String getDelByJmtgdTopId(Integer topid, String sofcode) {
		repoJMTGD.getDelByJmtgdTopId(topid, sofcode);
		return "Delete Successfully";
	}
	
	public String insAllSofCode(Integer topid) {
		return repoJMTGD.insAllSofCode(topid);
	}
}
