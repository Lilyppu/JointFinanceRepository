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
	
	@GetMapping("/tr/getTmcpCode")
	public Optional<TrMstCpersons> getTmcpCode(String cpcode){
		return servTMCP.getTmcpCode(cpcode);
	}
}
