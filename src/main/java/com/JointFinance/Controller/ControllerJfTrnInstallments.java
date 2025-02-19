package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.JointFinance.Models.JfTrnInstallments;
import com.JointFinance.Services.ServiceJfTrnInstallments;

@RestController
public class ControllerJfTrnInstallments {
	@Autowired
	ServiceJfTrnInstallments servJTIS;
	
	@GetMapping("/jf/getJtisAll")
	public List<JfTrnInstallments> getJtisAll(){
		return servJTIS.getJtisAll();
	}
	
	@GetMapping("/jf/getByJtisSofCodeAndJtisContractNoList")
	public List<JfTrnInstallments> getByJtisSofCodeAndJtisContractNoList(String contractno, String sofcode){
		return servJTIS.getByJtisSofCodeAndJtisContractNoList(contractno, sofcode);
	}
	
	@GetMapping("/jf/getByJtisContractNoList")
	public List<JfTrnInstallments> getByJtisContractNoList(String contractno){
		return servJTIS.getByJtisContractNoList(contractno);
	}
}
