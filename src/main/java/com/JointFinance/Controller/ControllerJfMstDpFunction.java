package com.JointFinance.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfMstDpFunction;
import com.JointFinance.Models.JfTrnSofAddedums;
import com.JointFinance.Services.ServiceJfMstDpFunction;
import com.JointFinance.Services.ServiceJfTrnSofAddedums;

@RestController
public class ControllerJfMstDpFunction {
	@Autowired
	ServiceJfMstDpFunction servJMDF;
	
	@GetMapping("/jf/getJmdfList")
	public List<JfMstDpFunction> getDpFuncList(){
		return servJMDF.getDpFuncList();
	}
}
