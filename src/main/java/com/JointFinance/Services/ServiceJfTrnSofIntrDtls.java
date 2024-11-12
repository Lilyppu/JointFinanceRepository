package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnSofIntrDtls;
import com.JointFinance.Repository.IJfTrnSofIntrDtlsRepository;

@Service
public class ServiceJfTrnSofIntrDtls {
	@Autowired
	IJfTrnSofIntrDtlsRepository repoJTSID;
	
	public List<JfTrnSofIntrDtls> getJtsidAll(){
		return repoJTSID.findAll();
	}
	
	public List<JfTrnSofIntrDtls> getJtsidList(String sof, Integer seq, Integer no){
		return repoJTSID.findByJtsidSofCodeAndJtsidSeqnoAndJtsidIntrNo(sof, seq, no);
	}
	
	

}
