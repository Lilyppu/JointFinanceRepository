package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfMstParameters;
import com.JointFinance.Models.JfTrnSofHdrs;
import com.JointFinance.Services.ServiceJfMstParameters;

@RestController

public class ControllerJfMstParameters {
	
	@Autowired
	ServiceJfMstParameters servJMP;
	
	@GetMapping("/jf/getJmpAll")
	public List<JfMstParameters> getJtshAll(){
		return servJMP.getJmpAll();
	}
	
	@GetMapping("/jf/getJmpByPcode")
	public List<JfMstParameters> getJmpByPcode(String code){
		return servJMP.getJmpByPcode(code);
	}
	
	@GetMapping("/jf/getJmpByPname")
	public List<JfMstParameters> getJmpByPname(String pname){
		return servJMP.getJmpByPname(pname);
	}
	
	@GetMapping("/jf/getJmpByPdesc")
	public List<JfMstParameters> getJmpByPdesc(String desc){
		return servJMP.getJmpByPdesc(desc);
	}
	
	@GetMapping("/jf/getJmpSingle")
	public Optional<JfMstParameters> getJmpSingle(String code){
		return servJMP.getJmpSingle(code);
	}
	
	@PostMapping("/jf/saveupdateJfMstParam")
	public String saveUpdateJfMstParam(@RequestBody JfMstParameters jmstparam) {
		return servJMP.saveUpdateJfMstParam(jmstparam);
	}

}
