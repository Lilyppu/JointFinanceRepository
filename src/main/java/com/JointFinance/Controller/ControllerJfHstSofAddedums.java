package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfHstSofAddedums;
import com.JointFinance.Services.ServiceJfHstSofAddedums;



@RestController
public class ControllerJfHstSofAddedums {
	@Autowired
	ServiceJfHstSofAddedums servJHSA;
	
	@GetMapping("/jf/getJhsaAll")
	public List<JfHstSofAddedums> getJtsbdAll(){
		return servJHSA.getJhsaAll();
	}
	
	@GetMapping("/jf/getJhsaSingle")
	public Optional<JfHstSofAddedums> getJtsbSingle(String sof, Integer seq, Integer ver){
		return servJHSA.getJhsaSingle(sof, seq, ver);
	}
	
}
