package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.JointFinance.Models.ViewJtlJfTrnSumContracts;
import com.JointFinance.Services.ServiceViewJtlJfTrnSumContracts;

@RestController
public class ControllerViewJtlJfTrnSumContracts {
	
	@Autowired
	ServiceViewJtlJfTrnSumContracts servJTLJTSC;
	
	@GetMapping("/jf/getJtlJtscList1")
	public List<ViewJtlJfTrnSumContracts> getJtlJtscList1(String pSofCode, String pLetterNo){
		return servJTLJTSC.getJtlJtscList1(pSofCode, pLetterNo);
	}
	
	@GetMapping("/jf/getJtlJtscList2")
	public List<ViewJtlJfTrnSumContracts> getJtlJtscList2(String pSofCode, String pLetterNo){
		return servJTLJTSC.getJtlJtscList2(pSofCode, pLetterNo);
	}


}
