package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.TrMstCounterparties;
import com.JointFinance.Services.ServiceTrMstCounterparties;

@RestController
public class ControllerTrMstCounterParties {

	@Autowired
	ServiceTrMstCounterparties servTMC;
	
	@GetMapping("/tr/getTmcAll")
	public List<TrMstCounterparties> getTmcAll(){
		return servTMC.getTmcAll();
	}
	
	@GetMapping("/tr/getTmcSingle")
	public Optional<TrMstCounterparties> getTmcSingle(String cpcode){
		return servTMC.getTmcSingle(cpcode);
	}
	
	@GetMapping("/tr/getTmcCpCodeList")
	public List<TrMstCounterparties> getTmcCpCodeList(String cpcode){
		return servTMC.getTmcCpCodeList(cpcode);
	}
	
}
