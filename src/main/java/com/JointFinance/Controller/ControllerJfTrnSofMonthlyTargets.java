package com.JointFinance.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnSofMonthlyTargets;
import com.JointFinance.Services.ServiceJfTrnSofMonthlyTargets;

@RestController
public class ControllerJfTrnSofMonthlyTargets {
	@Autowired
	ServiceJfTrnSofMonthlyTargets serviceSofMonthlyTargets;
	
	@GetMapping("/jf/getListSofMonthlyTargets")
	public List<JfTrnSofMonthlyTargets> findBySofCode(String sofCode) {
		return serviceSofMonthlyTargets.findBySofCode(sofCode);
	}
}
