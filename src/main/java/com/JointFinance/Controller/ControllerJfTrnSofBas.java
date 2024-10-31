package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnSofBas;
import com.JointFinance.Services.ServiceJfTrnSofBas;


@RestController
public class ControllerJfTrnSofBas {
	@Autowired
	ServiceJfTrnSofBas servJTSB;
	
	@GetMapping("/jf/getJtsbAll")
	public List<JfTrnSofBas> getJtsbdAll(){
		return servJTSB.getJtsbdAll();
	}
	
	@GetMapping("/jf/getJtsbSingle")
	public Optional<JfTrnSofBas> getJtsbSingle(String code, Integer seq, String acc){
		return servJTSB.getJtsbSingle(code, seq, acc);
	}
	
	@GetMapping("/jf/getJtsbBySofcodeAndSeq")
	public List<JfTrnSofBas> getJtsbBySofCodeAndSeq(String code, Integer seq){
		return servJTSB.getJtsbBySofCodeAndSeq(code, seq);
	}
	
	@PostMapping("/jf/saveupdateJtsb")
	public String saveUpdateJtsb (@RequestBody JfTrnSofBas jtsb) {		
		return servJTSB.saveUpdateJtsb(jtsb);
	}

}
