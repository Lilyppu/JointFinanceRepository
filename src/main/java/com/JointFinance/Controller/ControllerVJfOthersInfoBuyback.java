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

import com.JointFinance.Models.VJfOthersInfoBuyback;
import com.JointFinance.Services.ServiceVJfOthersInfoBuyback;

@RestController
public class ControllerVJfOthersInfoBuyback {
	@Autowired
	ServiceVJfOthersInfoBuyback servVJOIB;
	
	@GetMapping("/jf/getVjoibAll")
	public List<VJfOthersInfoBuyback> getVjoibAll(){
		return servVJOIB.getVjoibAll();
	}
	
	@GetMapping("/jf/getVjoiBuybackContractNoCU")
	public Optional<VJfOthersInfoBuyback> getVjoiBuybackContractNoCU(String contractno){
		return servVJOIB.getVjoiBuybackContractNoCU(contractno);
	}
}
