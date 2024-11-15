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
}
