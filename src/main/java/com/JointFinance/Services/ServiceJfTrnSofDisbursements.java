package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnSofDisbursements;
import com.JointFinance.Repository.IJfTrnSofDisbursementsRepository;
@Service
public class ServiceJfTrnSofDisbursements {
	@Autowired
	IJfTrnSofDisbursementsRepository repoJTSDS;
	
	public List<JfTrnSofDisbursements> getJtsdsAll(){
		return repoJTSDS.findAll();
	}
	
	public List<JfTrnSofDisbursements> getByJtsdsSofCodeList(String sofcode){
		return repoJTSDS.findByJtsdsSofCode(sofcode);
	}
	
	public Optional<JfTrnSofDisbursements> getJtsdsSofCodeAndSeqNoCU(String sofcode, Integer softcopyseqno){
		return repoJTSDS.findByJtsdsSofCodeAndJtsdsSeqNo(sofcode,softcopyseqno);
	}
	
	public String saveUpdateJfTrnSofDisbursements(JfTrnSofDisbursements jtsds) {
		repoJTSDS.save(jtsds);
		return "Submit Successfully";
	}
	
	public String getDelJtsds(String sofcode,Integer seqno) {
		repoJTSDS.getDelJtsds(sofcode,seqno);
		return "Delete Successfully";
	}
	
}
