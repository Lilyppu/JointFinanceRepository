package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnSofIntrDtls;
import com.JointFinance.Services.ServiceJfTrnSofIntrDtls;


@RestController
public class ControllerJfTrnSofIntrDtls {
	@Autowired
	ServiceJfTrnSofIntrDtls servJTSID;
	
	@GetMapping("/jf/getJtsidAll")
	public List<JfTrnSofIntrDtls> getJtsidAll(){
		return servJTSID.getJtsidAll();
	}
	
	@GetMapping("/jf/getJtsidList")
	public List<JfTrnSofIntrDtls> getJtsidList(String sof, Integer seq, Integer no){
		return servJTSID.getJtsidList(sof, seq, no);
	}
	
}
