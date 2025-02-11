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

import com.JointFinance.Models.VJfOthersInfoWo150;
import com.JointFinance.Services.ServiceVJfOthersInfoWo150;

@RestController
public class ControllerVJfOthersInfoWo150 {
	@Autowired
	ServiceVJfOthersInfoWo150 servVJOIW;
	
	@GetMapping("/jf/getVjoiwAll")
	public List<VJfOthersInfoWo150> getVjoiwAll(){
		return servVJOIW.getVjoiwAll();
	}
	
	@GetMapping("/jf/getVjoiByWo150ContractNoCU")
	public Optional<VJfOthersInfoWo150> getVjoiByWo150ContractNoCU(String contractno){
		return servVJOIW.getVjoiByWo150ContractNoCU(contractno);
	}
}
