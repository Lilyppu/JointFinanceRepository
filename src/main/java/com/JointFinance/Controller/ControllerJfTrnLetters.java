package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnLetters;
import com.JointFinance.Services.ServiceJfTrnLetters;

@RestController
public class ControllerJfTrnLetters {
	
	@Autowired
	ServiceJfTrnLetters servJTL;
	
	@GetMapping("/jf/getJtlList")
	public List<JfTrnLetters> getJtlList(String pLetterType, String pCpCode, String pSofCode, String pGroupCode) {
		return servJTL.getJtlList(pLetterType, pCpCode, pSofCode, pGroupCode);
	}
	
}
