package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.JointFinance.Models.TrMstCounterpartiesV;
import com.JointFinance.Services.ServiceTrMstCounterpartiesV;

@RestController
public class ControllerTrMstCounterpartiesV {

	@Autowired
	ServiceTrMstCounterpartiesV servTMCV;
    
	@GetMapping("/tr/getTmcvAll")
	public List<TrMstCounterpartiesV> getTmcvAll(){
		return servTMCV.getTmcvAll();
	}
	
	@GetMapping("/tr/getTmcvCpCode")
	public List<TrMstCounterpartiesV> getTmcvCpCode(String cpcode){
		return servTMCV.getTmcvCpCode(cpcode);
	}
}
