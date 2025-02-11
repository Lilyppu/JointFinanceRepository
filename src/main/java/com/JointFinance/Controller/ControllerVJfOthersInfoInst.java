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

import com.JointFinance.Models.VJfOthersInfoInst;
import com.JointFinance.Services.ServiceVJfOthersInfoInst;

@RestController
public class ControllerVJfOthersInfoInst {
	@Autowired
	ServiceVJfOthersInfoInst servVJOII;
	
	@GetMapping("/jf/getVjoiiAll")
	public List<VJfOthersInfoInst> getVjoiiAll(){
		return servVJOII.getVjoiiAll();
	}
	
	@GetMapping("/jf/getVjoiByInstContractNoCU")
	public Optional<VJfOthersInfoInst> getVjoiByInstContractNoCU(String contractno){
		return servVJOII.getVjoiByInstContractNoCU(contractno);
	}
}
