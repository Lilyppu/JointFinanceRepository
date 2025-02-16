package com.JointFinance.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.VJfApplInfo;
import com.JointFinance.Services.ServiceJfApplInfo;


@RestController
public class ControllerVJfApplInfo {
	@Autowired
	ServiceJfApplInfo servVJAI;
	
	@GetMapping("/jf/getVjaiAll")
	public List<VJfApplInfo> getVjaiAll(){
		return servVJAI.getVjaiAll();
	}
	
	@GetMapping("/jf/getVjaiByContractNoCU")
	public Optional<VJfApplInfo> getVjaiByContractNoCU(String contractno){
		return servVJAI.getVjaiByContractNoCU(contractno);
	}
}
