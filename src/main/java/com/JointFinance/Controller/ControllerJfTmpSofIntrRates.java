package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTmpSofIntrRates;
import com.JointFinance.Services.ServiceJfTmpSofIntrRates;



@RestController
public class ControllerJfTmpSofIntrRates {
	
	@Autowired
	ServiceJfTmpSofIntrRates servJTMSIR;
	
	@GetMapping("/jf/getJtmsirAll")
	public List<JfTmpSofIntrRates> getJtmsirAll(){
		return servJTMSIR.getJtmsirAll();
	}
	
	@GetMapping("/jf/getJtmsirSingle")
	public Optional<JfTmpSofIntrRates> getJtmsirSingle(String code, Integer seq){
		return servJTMSIR.getJtmsirSingle(code, seq);
	}

	@GetMapping("/jf/getJtmsirBySofCode")
	public List<JfTmpSofIntrRates> getJtmsirBySofCode(String sofcode){
		return servJTMSIR.getJtmsirBySofCode(sofcode);
	}
	
	@PostMapping("/jf/saveUpdateJfTmpSofIntrRates")
	public String saveUpdateJfTmpSofIntrRates(@RequestBody JfTmpSofIntrRates jtmsir) {
		return servJTMSIR.saveUpdateJfTmpSofIntrRates(jtmsir);
	}
}