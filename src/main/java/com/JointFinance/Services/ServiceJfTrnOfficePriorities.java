package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JFTrnSofCps;
import com.JointFinance.Models.JfTrnOfficePriorities;
import com.JointFinance.Repository.IJFTrnSofCpsRepository;
import com.JointFinance.Repository.IJfTrnOfficePrioritiesRepository;

@Service
public class ServiceJfTrnOfficePriorities {
	@Autowired
	IJfTrnOfficePrioritiesRepository repoJTOP;
	
	public List<JfTrnOfficePriorities> getJtopAll(){
		return repoJTOP.findAll();
	}
	
	public Optional<JfTrnOfficePriorities> getJtopSingle(String off, String sof){
		return repoJTOP.findByJtopOfficeCodeAndJtopSofCode(off, sof);
	}
	
}
