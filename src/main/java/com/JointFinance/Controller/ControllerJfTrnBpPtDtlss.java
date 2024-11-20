package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnBpPtDtls;
import com.JointFinance.Services.ServiceJfTrnBpPtDtls;


@RestController
public class ControllerJfTrnBpPtDtlss {
	@Autowired
	ServiceJfTrnBpPtDtls servJTBPDtls;
	
	@GetMapping("/jf/getJtbpdList")
	public List<JfTrnBpPtDtls> getJtbpdList(String ptno){
		return servJTBPDtls.getJtbpdList(ptno);
	}
	
	@GetMapping("/jf/getInsertJtbpd")
	public String runInsertPtDtl(String ptno, String psofcode, String pcontractno, String premark, String puser) {	
		System.out.println("aaaaa :"+ptno);
		return servJTBPDtls.runInsertPtDtl(ptno, psofcode, pcontractno, premark, puser);
	}
}
