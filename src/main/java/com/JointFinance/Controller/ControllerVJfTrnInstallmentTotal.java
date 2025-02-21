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

import com.JointFinance.Models.VJfTrnInstallmentTotal;
import com.JointFinance.Services.ServiceVJfTrnInstallmentTotal;

@RestController
public class ControllerVJfTrnInstallmentTotal {
	@Autowired
	ServiceVJfTrnInstallmentTotal servVJTIT;
	
	@GetMapping("/jf/getVjtitByContractNoCU")
	public Optional<VJfTrnInstallmentTotal> getVjtitByContractNoCU(String contractno){
		return servVJTIT.getVjtitByContractNoCU(contractno);
	}
}
