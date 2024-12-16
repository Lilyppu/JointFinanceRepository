package com.JointFinance.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnBpPtHdrs;
import com.JointFinance.Models.JfTrnSofParamDtls;
import com.JointFinance.Repository.IJfTrnSofParamDtlsRepository;

@Service
public class ServiceJfTrnSofParamDtls {
	@Autowired
	IJfTrnSofParamDtlsRepository repoJTSPD;
	
	public List<JfTrnSofParamDtls> getJtspdAll(){
		return repoJTSPD.findAll();
	}
	
	public List<JfTrnSofParamDtls> getJtspdList(String sof, Integer ver, Integer seq){
		return repoJTSPD.findByJtspdSofCodeAndJtspdVerAndJtspdSeqNo(sof, ver, seq);
	}
	
	public Optional<JfTrnSofParamDtls> getJtspdSingle(String sof, Integer ver, Integer seq, String off){
		return repoJTSPD.findByJtspdSofCodeAndJtspdVerAndJtspdSeqNoAndJtspdOfficeCode(sof, ver, seq, off);
	}
	
	public String SaveUpdJtspd(JfTrnSofParamDtls jtdpd) {
		repoJTSPD.save(jtdpd);
		return "Submit Successfully";
	}

}
