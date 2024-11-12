package com.JointFinance.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnSofIntrRates;
import com.JointFinance.Repository.IJfTrnSofIntrRatesRepository;



@Service
public class ServiceJfTrnSofIntrRates {
	@Autowired
	IJfTrnSofIntrRatesRepository repoJTSIR;
	
	public List<JfTrnSofIntrRates> getJtsirAll(){
		return repoJTSIR.findAll();
	}
	
	public Optional<JfTrnSofIntrRates> getJtsirSingle(String code, Integer seq){
		return repoJTSIR.findByJtsirSofCodeAndJtsirSeqno(code, seq);
	}
	
	public List<JfTrnSofIntrRates> getJtsirBySofCode(String sof){
		return repoJTSIR.findByJtsirSofCode(sof);
	}
	
}
