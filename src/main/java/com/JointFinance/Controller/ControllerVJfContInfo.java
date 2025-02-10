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

import com.JointFinance.Models.VJfContInfo;
import com.JointFinance.Services.ServiceVJfContInfo;


@RestController
public class ControllerVJfContInfo {
	@Autowired
	ServiceVJfContInfo servVJCI;
	
	@GetMapping("/jf/getVjciAll")
	public List<VJfContInfo> getVjciAll(){
		return servVJCI.getVjciAll();
	}
	
	@GetMapping("/jf/getVjciByContractNoCU")
	public Optional<VJfContInfo> getVjciByContractNoCU(String contractno){
		return servVJCI.getVjciByContractNoCU(contractno);
	}
}
