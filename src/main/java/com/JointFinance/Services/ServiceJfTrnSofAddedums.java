package com.JointFinance.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnSofAddedums;
import com.JointFinance.Repository.IJfTrnSofAddedumsRepository;

@Service
public class ServiceJfTrnSofAddedums {
	@Autowired
	IJfTrnSofAddedumsRepository repoJTSA;
	
	public List<JfTrnSofAddedums> getJtsaAll(){
		return repoJTSA.findAll();
	}
	
	public Optional<JfTrnSofAddedums> getJtsaSingle(String code, Integer seq){
		return repoJTSA.findByJtsaSofCodeAndJtsaSeqno(code, seq);
	}
	
	public List<JfTrnSofAddedums> getJtsaListBySofCode(String code){
		return repoJTSA.findByJtsaSofCode(code);
	}

}
