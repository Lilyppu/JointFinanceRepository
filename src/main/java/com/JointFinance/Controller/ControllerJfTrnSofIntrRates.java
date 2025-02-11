package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import java.math.BigDecimal;

import com.JointFinance.Models.JfTrnSofIntrRates;
import com.JointFinance.Services.ServiceJfTrnSofIntrRates;



@RestController
public class ControllerJfTrnSofIntrRates {
	
	@Autowired
	ServiceJfTrnSofIntrRates servJTSIR;
	
	@GetMapping("/jf/getJtsirAll")
	public List<JfTrnSofIntrRates> getJtsirAll(){
		return servJTSIR.getJtsirAll();
	}
	
	@GetMapping("/jf/getJtsirSingle")
	public Optional<JfTrnSofIntrRates> getJtsirSingle(String code, Integer seq){
		return servJTSIR.getJtsirSingle(code, seq);
	}

	@GetMapping("/jf/getJtsirBySofCode")
	public List<JfTrnSofIntrRates> getJtsirBySofCode(String sof){
		return servJTSIR.getJtsirBySofCode(sof);
	}
	
    @GetMapping("/jf/getfcof")
    public BigDecimal servJTSIR(
            @RequestParam String sofCode,
            @RequestParam Integer seqNo,
            @RequestParam Integer top,
            @RequestParam BigDecimal otsPrncAmt) {
        return servJTSIR.F_CALCULATE_COF(sofCode, seqNo, top, otsPrncAmt);
    }
}
