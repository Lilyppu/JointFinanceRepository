package com.JointFinance.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.LovJtsbCompBankP4B;
import com.JointFinance.Services.ServiceLovJtsbCompBankP4B;


@RestController
public class ControllerLovJtsbCompBankP4B {
	@Autowired
	ServiceLovJtsbCompBankP4B servP4B;
	
	@GetMapping("/jf/getJtcBankPB")
	public List<LovJtsbCompBankP4B> getJtscBankP4B(String cpcode){
		return servP4B.getJtscBankP4B(cpcode);
	}
	

}
