package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnSofAddedums;
import com.JointFinance.Services.ServiceJfTrnSofAddedums;

@RestController
public class ControllerJfTrnSofAddedums {
	@Autowired
	ServiceJfTrnSofAddedums servJTSA ;
	
	@GetMapping("/jf/getJtsaAll")
	public List<JfTrnSofAddedums> getJtsaAll(){
		return servJTSA.getJtsaAll();
	}
	
	@GetMapping("/jf/getJtsaListBySofCode")
	public List<JfTrnSofAddedums> getJtsaListBySofCode(String code){
		return servJTSA.getJtsaListBySofCode(code);
	}
	
	@GetMapping("/jf/getJtsaSingle")
	public Optional<JfTrnSofAddedums> getJtsaSingle(String code, Integer seq){
		return servJTSA.getJtsaSingle(code, seq);
	}
	
	
}
