package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.TrMstCpBranches;
import com.JointFinance.Services.ServiceTrMstCpBranches;

@RestController
public class ControllerTrMstCpBranches {
	@Autowired
	ServiceTrMstCpBranches servTMCBR;
	
	@GetMapping("/tr/getTmcbrAll")
	public List<TrMstCpBranches> getTmcbrAll(){
		return servTMCBR.getTmcbrAll();
	}
	
	@GetMapping("/tr/getTmcbrCpCode")
	public Optional<TrMstCpBranches> getTmcbrCpCode(String cpcode){
		return servTMCBR.getTmcbrCpCode(cpcode);
	}
	
	@GetMapping("/tr/getTmcbrBranchId")
	public Optional<TrMstCpBranches> getTmcbrBranchId(Integer branchid){
		return servTMCBR.getTmcbrBranchId(branchid);
	}
	
	@GetMapping("/tr/getTmcbrCpCodeAndTmcbrBranchId")
	public Optional<TrMstCpBranches> getTmcbrCpCodeAndTmcbrBranchId(String cpcode, Integer branchid){
		return servTMCBR.getTmcbrCpCodeAndTmcbrBranchId(cpcode, branchid);
	}
	
	@PostMapping("/tr/saveupdateTmcbr")
	public String saveUpdateTmcbr(@RequestBody TrMstCpBranches tmcbr) {
		return servTMCBR.saveUpdateTmcbr(tmcbr);
	}
}
