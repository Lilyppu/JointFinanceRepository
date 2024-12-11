package com.JointFinance.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.JointFinance.Models.TrMstCpBas;
import com.JointFinance.Services.ServiceTrMstCpBas;

@RestController
public class ControllerTrMstCpBas {
	@Autowired
	ServiceTrMstCpBas servTMCB;
	
	@GetMapping("/tr/getTmcbAll")
	public List<TrMstCpBas> getTmcbAll(){
		return servTMCB.getTmcbAll();
	}
	
	@GetMapping("/tr/getTmcbBankName")
	public List<TrMstCpBas> getTmcbBankName(String bankname){
		return servTMCB.getTmcbBankName(bankname);
	}
	
	
	@GetMapping("/tr/getTmcbAccountNo")
	public Optional<TrMstCpBas> getTmcbAccountNo(String accountno){
		return servTMCB.getTmcbAccountNo(accountno);
	}
	
	/*
	@GetMapping("/tr/getTmcbAccountNo")
	public ResponseEntity<TrMstCpBas> getTmcbAccountNo(@RequestParam String accountno) {
        Optional<TrMstCpBas> account = servTMCB.getTmcbAccountNo(accountno);
        return account.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }
	*/
	
	@PostMapping("/tr/saveupdateTmcb")
	public String saveUpdateTmcb(@RequestBody TrMstCpBas tmcb) {
		return servTMCB.saveUpdateTmcb(tmcb);
	}
	
	@GetMapping("/tr/getListTmcbSfN")
	public List<TrMstCpBas> getListTmcbSfN() {
		return servTMCB.getListTmcbSfN();
	}
	
	@GetMapping("/tr/test")
	public ResponseEntity<String> test() {
	    return ResponseEntity.ok("Endpoint is working!");
	}
	
	@GetMapping("/tr/approveCpBas")
	public String approveCpBas(String accountno) {
		servTMCB.approveCpBas(accountno);
		return "Approve Success";
	}
	
}