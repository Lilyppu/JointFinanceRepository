package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnBpPtHdrs;
import com.JointFinance.Repository.IJfTrnBpPtHdrsRepository;


@Service
public class ServiceJfTrnBpPtHdrs {
	@Autowired
	IJfTrnBpPtHdrsRepository repoJTBPH;
	
	public List<JfTrnBpPtHdrs> getJtbpdList(){
		return repoJTBPH.getJtbphAll();
	}
	
	public List<JfTrnBpPtHdrs> getJtbpdByPtNo(String ptno){
		return repoJTBPH.getJtbphByNo(ptno);
	}
	
	public List<JfTrnBpPtHdrs> getJtbpdByStatus(String Sta){
		return repoJTBPH.findByJtbphStatus(Sta);
	}
	
	public List<JfTrnBpPtHdrs> getJtbpdBySofCode(String sof){
		return repoJTBPH.findByJtbphSofCode(sof);
	}
	
	
}
