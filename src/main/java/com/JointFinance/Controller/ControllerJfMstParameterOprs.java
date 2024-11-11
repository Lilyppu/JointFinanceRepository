package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfMstParameterOprs;
import com.JointFinance.Models.JfMstParameters;
import com.JointFinance.Services.ServiceJfMstParameterOprs;

@RestController

public class ControllerJfMstParameterOprs {
	
	@Autowired
	ServiceJfMstParameterOprs servJMPO;
	
	@GetMapping("/jf/getJmpoByPcode")
	public List<JfMstParameterOprs> getJmpoByPcode(String code){
		return servJMPO.getJmpoByPcode(code);
	}
	
	@GetMapping("/jf/getJmpoSingle")
	public Optional<JfMstParameterOprs> getJmpoSingle(String code, String oprs){
		return servJMPO.getJmpoSingle(code, oprs);
	}
	
	@PostMapping("/jf/saveupdateJfMstParamOprs")
	public String saveUpdateJfMstParamOprs(@RequestBody JfMstParameterOprs jmstparamoprs) {
		return servJMPO.saveUpdateJfMstParamOprs(jmstparamoprs);
	}

}
