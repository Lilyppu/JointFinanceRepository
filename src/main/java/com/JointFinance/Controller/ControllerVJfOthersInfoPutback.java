package com.JointFinance.Controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.VJfOthersInfo;
import com.JointFinance.Models.VJfOthersInfoPutback;
import com.JointFinance.Services.ServiceVJfOthersInfoPutback;

@RestController
public class ControllerVJfOthersInfoPutback {
	@Autowired
	ServiceVJfOthersInfoPutback servVJOIP;
	
	@GetMapping("/jf/getVjoipAll")
	public List<VJfOthersInfoPutback> getVjoipAll(){
		return servVJOIP.getVjoipAll();
	}
	
	@GetMapping("/jf/getByVjoiPbContractNo")
	public Optional<VJfOthersInfoPutback> getByVjoiPbContractNo(String contractno){
		return servVJOIP.getByVjoiPbContractNo(contractno);
	}
	
	@GetMapping("/jf/getOthersInfoPutback")
	public String getOthersInfoPutback (String pi_contract) {
		return servVJOIP.getOthersInfoPutback(pi_contract);
	}
	
	/*
	@GetMapping("/jf/getOthersInfoPutback")
	public String getOthersInfoPutback (String pi_contract, String po_contract_no, String po_letter_no, Date po_letter_date, BigDecimal po_prnc_amt_fif_by_cp) {
		return servVJOIP.getOthersInfoPutback(pi_contract, po_contract_no, po_letter_no, po_letter_date, po_prnc_amt_fif_by_cp);
	}
	*/
}
