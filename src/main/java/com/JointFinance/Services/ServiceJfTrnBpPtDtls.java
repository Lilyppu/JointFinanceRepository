package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnBpPtDtls;
import com.JointFinance.Repository.IJfTrnBpPtDtlsRepository;

@Service
public class ServiceJfTrnBpPtDtls {
	@Autowired
	IJfTrnBpPtDtlsRepository repoJTBPDtls;
	
	public List<JfTrnBpPtDtls> getJtbpdList(String ptno){
		return repoJTBPDtls.findByJtbpdNo(ptno);
	}
	
	public String runInsertPtDtl(String ptno, String psofcode, String pcontractno, String premark, String puser) {		
		return repoJTBPDtls.runProses(ptno, psofcode, pcontractno, premark, puser);
	}
}
