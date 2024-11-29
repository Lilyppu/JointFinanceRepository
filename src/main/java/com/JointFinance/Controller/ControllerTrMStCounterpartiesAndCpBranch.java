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

import com.JointFinance.Models.TrMstCounterpartiesAndCpBranch;
import com.JointFinance.Services.ServiceTrMstCounterpartiesAndCpBranch;

@RestController
public class ControllerTrMStCounterpartiesAndCpBranch {

	@Autowired
	ServiceTrMstCounterpartiesAndCpBranch servTMCACB;
    
	@GetMapping("/tr/getTmcacbList")
	public List<TrMstCounterpartiesAndCpBranch> getTmcacbList(){
		return servTMCACB.getTmcacbList();
	}
	
	@GetMapping("/tr/getTmcacbByCpCode")
	public List<TrMstCounterpartiesAndCpBranch> getTmcacbByCpCode(String pCp){
		return servTMCACB.getTmcacbByCpCode(pCp);
	}
	
	@GetMapping("/tr/getTmcacbByCpCodeAndBranchId")
	public Optional<TrMstCounterpartiesAndCpBranch> getTmcacbByCpCodeAndBranchId(String pCp, Integer pBi){
		return servTMCACB.getTmcacbByCpCodeAndBranchId(pCp, pBi);
	}
}
