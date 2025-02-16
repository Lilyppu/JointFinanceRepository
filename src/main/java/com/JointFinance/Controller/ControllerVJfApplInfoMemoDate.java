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

import com.JointFinance.Models.VJfApplInfoMemoDate;
import com.JointFinance.Services.ServiceVJfApplInfoMemoDate;

@RestController
public class ControllerVJfApplInfoMemoDate {
	@Autowired
	ServiceVJfApplInfoMemoDate servVJAIMD;
	
	@GetMapping("/jf/getVjaimdAll")
	public List<VJfApplInfoMemoDate> getVjaimdAll(){
		return servVJAIMD.getVjaimdAll();
	}
	
	@GetMapping("/jf/getVjaimdByContractNoCU")
	public Optional<VJfApplInfoMemoDate> getVjaimdByContractNoCU(String contractno){
		return servVJAIMD.getVjaimdByContractNoCU(contractno);
	}
}
