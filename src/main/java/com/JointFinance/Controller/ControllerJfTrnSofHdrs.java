package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnSofHdrs;
import com.JointFinance.Services.ServiceJfTrnSofHdrs;


@RestController
public class ControllerJfTrnSofHdrs {
	@Autowired
	ServiceJfTrnSofHdrs servJTSH;
	
	@GetMapping("/jf/getJtshAll")
	public List<JfTrnSofHdrs> getJtshAll(){
		return servJTSH.getJtshAll();
	}
	
	@GetMapping("/jf/getJtshSingle")
	public Optional<JfTrnSofHdrs> getJtshSingle(String code){
		return servJTSH.getJtshSingle(code);
	}
	

}
