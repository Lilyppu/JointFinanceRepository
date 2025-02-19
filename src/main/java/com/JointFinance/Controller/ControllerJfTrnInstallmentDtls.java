package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.JointFinance.Models.JfTrnInstallmentDtls;
import com.JointFinance.Services.ServiceJfTrnInstallmentDtls;

@RestController
public class ControllerJfTrnInstallmentDtls {
	@Autowired
	ServiceJfTrnInstallmentDtls servJTID;
	
	@GetMapping("/jf/getJtidAll")
	public List<JfTrnInstallmentDtls> getJtidAll(){
		return servJTID.getJtidAll();
	}
	
	@GetMapping("/jf/getByJtidSofCodeAndJtidContractNoList")
	public List<JfTrnInstallmentDtls> getByJtidSofCodeAndJtidContractNoList(String contractno, String sofcode){
		return servJTID.getByJtidSofCodeAndJtidContractNoList(contractno, sofcode);
	}
	
	@GetMapping("/jf/getByJtidContractNoList")
	public List<JfTrnInstallmentDtls> getByJtidContractNoList(String contractno){
		return servJTID.getByJtidContractNoList(contractno);
	}
	
}
