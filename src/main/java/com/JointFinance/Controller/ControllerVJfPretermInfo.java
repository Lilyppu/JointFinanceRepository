package com.JointFinance.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.VJfPretermInfo;
import com.JointFinance.Services.ServiceVJfPretermInfo;

@RestController
public class ControllerVJfPretermInfo {
	@Autowired
	ServiceVJfPretermInfo  servVJPtI;
	
	@GetMapping("/jf/getVjptiList")
	public  Optional<VJfPretermInfo> getVjpti (String ptno, String sof)
	{
		return servVJPtI.getVjpti(ptno, sof);
	}
}
