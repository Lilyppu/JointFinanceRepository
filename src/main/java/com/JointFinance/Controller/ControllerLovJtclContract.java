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
	
}
