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

import com.JointFinance.Models.VJfOthersInfoPreterm;
import com.JointFinance.Services.ServiceVJfOthersInfoPreterm;

@RestController
public class ControllerVJfOthersInfoPreterm {
	@Autowired
	ServiceVJfOthersInfoPreterm servVJOIPR;
	
	@GetMapping("/jf/getVjoiprAll")
	public List<VJfOthersInfoPreterm> getVjoiprAll(){
		return servVJOIPR.getVjoiprAll();
	}
	
	@GetMapping("/jf/getVjoiByPretermContractNoCU")
	public Optional<VJfOthersInfoPreterm> getVjoiByPretermContractNoCU(String contractno){
		return servVJOIPR.getVjoiByPretermContractNoCU(contractno);
	}
}
