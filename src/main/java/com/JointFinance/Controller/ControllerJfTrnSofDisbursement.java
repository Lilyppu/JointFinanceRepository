package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.JointFinance.Models.JfTrnSofDisbursements;
import com.JointFinance.Models.JfTrnSofSoftcopies;
import com.JointFinance.Services.ServiceJfTrnSofDisbursements;

@RestController
public class ControllerJfTrnSofDisbursement {

	@Autowired
	ServiceJfTrnSofDisbursements servJTSDS;
	
	@GetMapping("/jf/getJtsdsAll")
	public List<JfTrnSofDisbursements> getJtsdsAll(){
		return servJTSDS.getJtsdsAll();
	}
	/*
	@GetMapping("/jf/getJtsdsAllCstm")
	public List<JfTrnSofDisbursements> getJtsdsAllCstm(){
		return servJTSDS.getJtsdsAllCstm();
	}
	*/
	
	/*
	@GetMapping("/jf/getJtsdsAllCstm")
	public ResponseEntity<List<JfTrnSofDisbursements>> getAllSoftCopies() {
	        List<JfTrnSofDisbursements> softCopies = servJTSDS.getAllWithDescription();
	        return ResponseEntity.ok(softCopies);
	}
	*/
	
	@GetMapping("/jf/getByJtsdsSofCodeList")
	public List<JfTrnSofDisbursements> getByJtsdsSofCodeList(String sofcode){
		return servJTSDS.getByJtsdsSofCodeList(sofcode);
	}
	
	@GetMapping("/jf/getJtsdsSofCodeAndSeqNoCU")
	public Optional<JfTrnSofDisbursements> getJtsdsSofCodeAndSeqNoCU(String sofcode, Integer seqno){
		return servJTSDS.getJtsdsSofCodeAndSeqNoCU(sofcode,seqno);
	}
	
	@PostMapping("/jf/saveUpdateJfTrnSofDisbursements")
	public String saveUpdateJfTrnSofDisbursements(@RequestBody JfTrnSofDisbursements jtsds) {
		return servJTSDS.saveUpdateJfTrnSofDisbursements(jtsds);
	}
	
	@GetMapping("/jf/getDelJtsds")
	public String getDelJtss(String sofcode, Integer seqno) {
		servJTSDS.getDelJtsds(sofcode,seqno);
		return "Delete Successfully";
	}
	
	/*
	@GetMapping("/jf/getSofDesc")
    public String getSofDescription(@RequestParam String sofCode) {
        return servJTSDS.getSofDescription(sofCode);
    }
	*/
	
	/*
	@GetMapping(path = "/jf/getSofDesc")
    public String getSofDesc(String sofcode,String sofcodedesc) {
		return servJTSDS.getSofDesc(sofcode,sofcodedesc);
	}
	*/
	
	/*
	@GetMapping("/jf/getDescriptionJtss")
	public String getDescriptionJtss(String softcopycode) {
		return servJTSS.getDescriptionJtss(softcopycode);
	}
	*/
}
