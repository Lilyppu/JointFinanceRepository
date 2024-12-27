package com.JointFinance.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnSofDailyTargets;
import com.JointFinance.Services.ServiceJfTrnSofDailyTargets;

@RestController
public class ControllerJfTrnSofDailyTargets {
	@Autowired
	ServiceJfTrnSofDailyTargets serviceSofDailyTargets;
	
	@GetMapping("/jf/getListSofDailyTargets")
	public List<JfTrnSofDailyTargets> findBySofCode(String jtsdtSofCode) {
		return serviceSofDailyTargets.findBySofCode(jtsdtSofCode);
	}
}
