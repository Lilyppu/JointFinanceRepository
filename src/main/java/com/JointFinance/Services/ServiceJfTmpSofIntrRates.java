package com.JointFinance.Services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTmpSofIntrRates;
import com.JointFinance.Repository.IJfTmpSofIntrRatesRepository;

@Service
public class ServiceJfTmpSofIntrRates {

	@Autowired
	IJfTmpSofIntrRatesRepository repoJTMSIR;
	
	public List<JfTmpSofIntrRates> getJtmsirAll(){
		return repoJTMSIR.findAll();
	}
	
	public Optional<JfTmpSofIntrRates> getJtmsirSingle(String sofcode, Integer seqno){
		return repoJTMSIR.findByJtmsirSofCodeAndJtmsirSeqNo(sofcode, seqno);
	}
	
	public List<JfTmpSofIntrRates> getJtmsirBySofCode(String sofcode){
		return repoJTMSIR.findByJtmsirSofCode(sofcode);
	}
	
	public String saveUpdateJfTmpSofIntrRates(JfTmpSofIntrRates jtmsir) {
		repoJTMSIR.save(jtmsir);
		return "Submit Successfully";
	}
	
	public String procApproveIntrRates(String p_userid) {
		return repoJTMSIR.procApproveIntrRates(p_userid);
	}
}