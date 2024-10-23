package com.JointFinance.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JFTrnSofCps;
import com.JointFinance.Repository.IJFTrnSofCpsRepository;

@Service
public class ServiceJFTrnSofCps {
	@Autowired
	IJFTrnSofCpsRepository repoJTSC;
	
	public List<JFTrnSofCps> getJtscAll(){
		return repoJTSC.findAll();
	}
	
	public Optional<JFTrnSofCps> getJtscSingle(String code, Integer seq){
		return repoJTSC.findByJtscSofCodeAndJtscSeqno(code, seq);
	}

}
