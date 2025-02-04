package com.JointFinance.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.VLovSofTarget;
import com.JointFinance.Services.ServiceVLovSofTarget;

@RestController
public class ControllerVLovSofTarget {
	@Autowired
	ServiceVLovSofTarget serviceSofTarget;
	
	@GetMapping("/jf/getLovSofTarget")
	public List<VLovSofTarget> findSofTarget() {
		return serviceSofTarget.getListVLovSofTarget();
	}
}
