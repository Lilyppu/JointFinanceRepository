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

import com.JointFinance.Models.VJfOthersInfo;
import com.JointFinance.Services.ServiceVJfOthersInfo;

@RestController
public class ControllerVJfOthersInfo {
	@Autowired
	ServiceVJfOthersInfo servVJOI;
	
	@GetMapping("/jf/getVjoiAll")
	public List<VJfOthersInfo> getVjoiAll(){
		return servVJOI.getVjoiAll();
	}
	
	@GetMapping("/jf/getVjoiByPbContractNoCU")
	public Optional<VJfOthersInfo> getVjoiByPbContractNoCU(String contractno){
		return servVJOI.getVjoiByPbContractNoCU(contractno);
	}
}
