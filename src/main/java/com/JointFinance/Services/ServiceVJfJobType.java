package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfJobType;
import com.JointFinance.Repository.IVJfJobTypeRepository;
@Service
public class ServiceVJfJobType {
    @Autowired
	IVJfJobTypeRepository repoVjjt;
	
	public List<VJfJobType> getJobTypeList(){
		return repoVjjt.findAll();
	}
	
	public String RunReProcess (String p_name, String p_status, String puserid) {
		return repoVjjt.runProses(p_name, p_status, puserid);
	}
	
	public String runSendEmail(String p_name,  String pto, String psubject, String pnote, String puserid) {
		
		repoVjjt.updateEmail(p_name, pto, psubject, pnote);
		return repoVjjt.runSendEmail(p_name, puserid);
	}
	
}
