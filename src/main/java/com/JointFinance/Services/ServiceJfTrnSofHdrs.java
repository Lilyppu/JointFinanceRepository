package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnSofHdrs;
import com.JointFinance.Repository.IJfTrnSofHdrsRepository;

@Service
public class ServiceJfTrnSofHdrs {
	@Autowired
	IJfTrnSofHdrsRepository repoJTSH;
	
	public List<JfTrnSofHdrs> getJtshAll(){
		return repoJTSH.findAll();
	}
	
	public Optional<JfTrnSofHdrs> getJtshSingle(String code){
		return repoJTSH.findById(code);
	}
	

}
