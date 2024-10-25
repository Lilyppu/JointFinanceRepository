package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnSofBas;
import com.JointFinance.Repository.IJfTrnSofBasrepository;

@Service
public class ServiceJfTrnSofBas {
	@Autowired
	IJfTrnSofBasrepository repoJTSB;
	
	public List<JfTrnSofBas> getJtsbdAll(){
		return repoJTSB.findAll();
	}
	
	public Optional<JfTrnSofBas> getJtsbSingle(String sof, Integer seq, String acc){
		return repoJTSB.findByJtsbSofCodeAndJtsbSeqNoAndJtsbAcctNo(sof, seq, acc);
	}
	
	
}
