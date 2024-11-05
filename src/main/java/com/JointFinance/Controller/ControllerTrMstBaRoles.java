package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.TrMstBaRoles;
import com.JointFinance.Services.ServiceTrMstBaRoles;

@RestController
public class ControllerTrMstBaRoles {
	@Autowired
	ServiceTrMstBaRoles servTMBR;
	
	@GetMapping("/tr/getTmbrAll")
	public List<TrMstBaRoles> getTmbrAll(){
		return servTMBR.getTmbrAll();
	}
	
	@GetMapping("/tr/getTmbrBankName")
	public List<TrMstBaRoles> getTmbrBankName(String bankname){
		return servTMBR.getTmbrBankName(bankname);
	}
	
	@GetMapping("/tr/getTmbrAccountNo")
	public List<TrMstBaRoles> getTmbrAccountNo(String accountno){
		return servTMBR.getTmbrAccountNo(accountno);
	}
	
	@GetMapping("/tr/getTmbrCpCode")
	public List<TrMstBaRoles> getTmbrCpCode(String cpcode){
		return servTMBR.getTmbrCpCode(cpcode);
	}
	
	@GetMapping("/tr/getTmbrBranchId")
	public List<TrMstBaRoles> getTmbrBranchId(Integer branchid){
		return servTMBR.getTmbrBranchId(branchid);
	}
	
	@GetMapping("/tr/getTmbrRoleCode")
	public List<TrMstBaRoles> getTmbrRoleCode(String rolecode){
		return servTMBR.getTmbrRoleCode(rolecode);
	}
}
