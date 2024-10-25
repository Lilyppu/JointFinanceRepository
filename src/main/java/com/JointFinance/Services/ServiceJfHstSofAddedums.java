package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfHstSofAddedums;
import com.JointFinance.Repository.IJfHstSofAddedumsRepository;


@Service
public class ServiceJfHstSofAddedums {
	@Autowired
	IJfHstSofAddedumsRepository repoJHSA;
	
	public List<JfHstSofAddedums> getJhsaAll(){
		return repoJHSA.findAll();
	}
	
	public Optional<JfHstSofAddedums> getJhsaSingle(String sof, Integer seq, Integer ver){
		return repoJHSA.findByJhsaSofCodeAndJhsaSeqnoAndJhsaVersion(sof, seq, seq);
	}

}
