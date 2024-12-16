package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.VJfJobType;
import com.JointFinance.Services.ServiceVJfJobType;



@RestController
public class ControllerVJfJobType {
	@Autowired
	ServiceVJfJobType servVjjt;
	
	@GetMapping("/jf/getJobTypeList")
	public List<VJfJobType> getJobTypeList(){
		return servVjjt.getJobTypeList();
	}
	
	@GetMapping("/jf/rerunprocess")
	public String RunReProcess (String p_name, String p_status, String puserid) {
		return servVjjt.RunReProcess(p_name, p_status, puserid);
	}
	
	@GetMapping("/jf/runsendemail")
	public String runSendEmail(String p_name,  String pto, String psubject, String pnote,  String puserid) {
		System.out.println("aaaaa :"+p_name+"-"+pto+"-"+psubject+"-"+pnote);
		return servVjjt.runSendEmail(p_name, pto, psubject, pnote, puserid);
	}
}
