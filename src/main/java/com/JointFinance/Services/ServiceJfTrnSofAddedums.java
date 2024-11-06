package com.JointFinance.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
	
	public Optional<JfTrnSofAddedums> getJtsaListBySofCode(String code){
		return repoJTSA.findByJtsaSofCode(code);
	}
	
	public String updAddendumChanged(String sof, Integer seq, Integer version) {
		return repoJTSA.runAddVersion(sof, seq, version);
	}
	
	public String saveUpdateAddedum(@RequestBody JfTrnSofAddedums jtsa ) {
		repoJTSA.save(jtsa);
		return "Submit Successfully";
	}
	

}
