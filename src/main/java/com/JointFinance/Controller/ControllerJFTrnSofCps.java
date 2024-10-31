package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JFTrnSofCps;
import com.JointFinance.Services.ServiceJFTrnSofCps;

@RestController
public class ControllerJFTrnSofCps {
	@Autowired
	ServiceJFTrnSofCps servJTSC;
	
	@GetMapping("/jf/getJtscAll")
	public List<JFTrnSofCps> getJtscAll(){
		return servJTSC.getJtscAll();
	}
	
	@GetMapping("/jf/getJtscSingle")
	public Optional<JFTrnSofCps> getJtscSingle(String code, Integer seq){
		return servJTSC.getJtscSingle(code, seq);
	}
	
	@GetMapping("/jf/getJtscListBySofCode")
	public List<JFTrnSofCps> getJtscListBySofCode(String code){
		return servJTSC.getJtscListBySofCode(code);
	}
	
	@PostMapping("/jf/saveupdateJtsc")
	public String saveUpdateJtsc(@RequestBody JFTrnSofCps jtsc) {
		return servJTSC.saveUpdateJtsc(jtsc);
		
	}

}
