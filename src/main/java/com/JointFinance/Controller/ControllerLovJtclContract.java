package com.JointFinance.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.LovJtclContract;
import com.JointFinance.Services.ServiceLovJtclContract;


@RestController
public class ControllerLovJtclContract {
	
	@Autowired
	ServiceLovJtclContract servJTCL;
	
	@GetMapping("/jf/getJtclAll")
	public List<LovJtclContract> getJtclAll(){
		return servJTCL.getJtclAll();
	}

	@GetMapping("/jf/getVjtclBySofCode")
	public List<LovJtclContract> getVjtclBySofCode(String sofcode){
		return servJTCL.getVjtclBySofCode(sofcode);
	}
	
	@GetMapping("/jf/getVjtclByContractNo")
	public List<LovJtclContract> getVjtclByContractNo(String contractno){
		return servJTCL.getVjtclByContractNo(contractno);
	}
	
	@GetMapping("/jf/getVjtclByContractNoCU")
	public Optional<LovJtclContract> getVjtclByContractNoCU(String contractno){
		return servJTCL.getVjtclByContractNoCU(contractno);
	}
}
