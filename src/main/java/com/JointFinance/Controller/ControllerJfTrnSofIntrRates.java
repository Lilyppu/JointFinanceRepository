package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnSofIntrRates;
import com.JointFinance.Services.ServiceJfTrnSofIntrRates;



@RestController
public class ControllerJfTrnSofIntrRates {
	
	@Autowired
	ServiceJfTrnSofIntrRates servJTSIR;
	
	@GetMapping("/jf/getJtsirAll")
	public List<JfTrnSofIntrRates> getJtsirAll(){
		return servJTSIR.getJtsirAll();
	}
	
	@GetMapping("/jf/getJtsirSingle")
	public Optional<JfTrnSofIntrRates> getJtsirSingle(String code, Integer seq){
		return servJTSIR.getJtsirSingle(code, seq);
	}

}
