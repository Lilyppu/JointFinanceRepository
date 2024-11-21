package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.TrMstCpersons;
import com.JointFinance.Services.ServiceTrMstCpersons;

@RestController
public class ControllerTrMstCpersons {
	@Autowired
	ServiceTrMstCpersons servTMCP;
	
	@GetMapping("/tr/getTmcpAll")
	public List<TrMstCpersons> getTmcpAll(){
		return servTMCP.getTmcpAll();
	}
	
	@GetMapping("/tr/getTmcpCpCode")
	public Optional<TrMstCpersons> getTmcpCpCode(String cpcode){
		return servTMCP.getTmcpCpCode(cpcode);
	}
	
	@GetMapping("/tr/getTmcpBranchId")
	public List<TrMstCpersons> getTmcpBranchId(Integer branchid){
		return servTMCP.getTmcpBranchId(branchid);
	}
	
	@GetMapping("/tr/getTmcpCpCodeAndTmcpBranchId")
	public List<TrMstCpersons> getTmcpCpCodeAndTmcpBranchId(String cpcode, Integer branchid){
		return servTMCP.getTmcpCpCodeAndTmcpBranchId(cpcode, branchid);
	}
	
	@PostMapping("/tr/saveupdateTmcp")
	public String SaveUpdTmcp(@RequestBody TrMstCpersons tmcp){
		return servTMCP.saveUpdateTmcp(tmcp);
	}
}
