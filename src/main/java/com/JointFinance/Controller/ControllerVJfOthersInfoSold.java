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

import com.JointFinance.Models.VJfOthersInfoSold;
import com.JointFinance.Services.ServiceVJfOthersInfoSold;

@RestController
public class ControllerVJfOthersInfoSold {
	@Autowired
	ServiceVJfOthersInfoSold servVJOIS;
	
	@GetMapping("/jf/getVjoisAll")
	public List<VJfOthersInfoSold> getVjoisAll(){
		return servVJOIS.getVjoisAll();
	}
	
	@GetMapping("/jf/getVjoiBySoldContractNoCU")
	public Optional<VJfOthersInfoSold> getVjoiBySoldContractNoCU(String contractno){
		return servVJOIS.getVjoiBySoldContractNoCU(contractno);
	}
}
