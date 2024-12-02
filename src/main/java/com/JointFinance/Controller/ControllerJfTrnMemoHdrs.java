package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnMemoHdrs;
import com.JointFinance.Services.ServiceJfTrnMemoHdrs;

@RestController
public class ControllerJfTrnMemoHdrs {
	
	@Autowired
	ServiceJfTrnMemoHdrs servJTMH;
	
	@GetMapping("/jf/getJtmhList")
	public List<JfTrnMemoHdrs> getJtmhList(String SofCode, String ReffLetterNo){
		return servJTMH.getJtmhList(SofCode, ReffLetterNo);
	}
	
	@PostMapping("/jf/SaveUpdMemoHdrs")
	public String saveUpdateMemoHdrs(@RequestBody JfTrnMemoHdrs jtmh) {		
		return servJTMH.saveUpdateMemoHdrs(jtmh);
	}
	
}
