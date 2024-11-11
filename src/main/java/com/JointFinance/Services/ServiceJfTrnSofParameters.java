package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnSofHdrs;
import com.JointFinance.Models.JfTrnSofParameters;
import com.JointFinance.Repository.IJfTrnSofParametersRepository;



@Service
public class ServiceJfTrnSofParameters {
	@Autowired
	IJfTrnSofParametersRepository repoJTSP;
	
	public List<JfTrnSofParameters> getJtspAll(){
		return repoJTSP.findAll();
	}
	
	public Optional<JfTrnSofParameters> getJtphSingle(String sof, Integer ver, Integer seq){
		return repoJTSP.findByJtspSofCodeAndJtspVerAndJtspSeqNo(sof, ver, seq);
	}
	
	public List<JfTrnSofParameters> getJtphBySofCode(String sof){
		return repoJTSP.findByJtspSofCode(sof);
	}
	
}
