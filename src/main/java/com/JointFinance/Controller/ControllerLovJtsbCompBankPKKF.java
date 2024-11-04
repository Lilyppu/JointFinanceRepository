package com.JointFinance.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.LovJtsbCompBankPKKF;
import com.JointFinance.Services.ServiceLovJtsbCompBankPKKF;


@RestController
public class ControllerLovJtsbCompBankPKKF {
	@Autowired
	ServiceLovJtsbCompBankPKKF servPKKF;
	
	@GetMapping("/jf/getJtcBankPKKF")
	public List<LovJtsbCompBankPKKF> getLovJtscBankPKKF(String cpcode){
		return servPKKF.getLovJtscBankPKKF(cpcode);
	}
	

}
