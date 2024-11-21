package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfMstParameters;
import com.JointFinance.Models.TrMstCpRoles;
import com.JointFinance.Services.ServiceTrMstCpRoles;

@RestController
public class ControllerTrMstCpRoles {
	@Autowired
	ServiceTrMstCpRoles servTMCR;
	
	@GetMapping("/tr/getTmcrAll")
	public List<TrMstCpRoles> getTmcrAll(){
		return servTMCR.getTmcrAll();
	}
	
	@GetMapping("/tr/getTmcrCpCode")
	public List<TrMstCpRoles> getTmcrCpCode(String cpcode){
		return servTMCR.getTmcrCpCode(cpcode);
	}
	
	@GetMapping("/tr/getTmcrBranchId")
	public List<TrMstCpRoles> getTmcrBranchId(Integer branchid){
		return servTMCR.getTmcrBranchId(branchid);
	}
	
	@GetMapping("/tr/getTmcrRoleCode")
	public List<TrMstCpRoles> getTmcrRoleCode(String rolecode){
		return servTMCR.getTmcrRoleCode(rolecode);
	}
	
	@GetMapping("/tr/getTmcrCpCodeAndTmcrBranchId")
	public List<TrMstCpRoles> getTmcrCpCodeAndTmcrBranchId(String cpcode, Integer branchid){
		return servTMCR.getTmcrCpCodeAndTmcrBranchId(cpcode, branchid);
	}
	
	@GetMapping("/tr/getTmcrCpCodeAndTmcrBranchIdAndTmcrRoleCode")
	public Optional<TrMstCpRoles> getTmcrCpCodeAndTmcrBranchIdAndTmcrRoleCode(String cpcode, Integer branchid, String rolecode){
		return servTMCR.getTmcrCpCodeAndTmcrBranchIdAndTmcrRoleCode(cpcode, branchid, rolecode);
	}
	
	@PostMapping("/tr/saveupdateTmcr")
	public String saveUpdateTmcr(@RequestBody TrMstCpRoles tmcr) {
		return servTMCR.saveUpdateTmcr(tmcr);
	}
}
