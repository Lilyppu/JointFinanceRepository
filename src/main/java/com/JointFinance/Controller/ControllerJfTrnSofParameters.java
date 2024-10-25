package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnSofHdrs;
import com.JointFinance.Models.JfTrnSofParameters;
import com.JointFinance.Services.ServiceJfTrnSofHdrs;
import com.JointFinance.Services.ServiceJfTrnSofParameters;


@RestController
public class ControllerJfTrnSofParameters {
	@Autowired
	ServiceJfTrnSofParameters servJTSP;
	
	@GetMapping("/jf/getJtspAll")
	public List<JfTrnSofParameters> getJtspAll(){
		return servJTSP.getJtspAll();
	}
	
	@GetMapping("/jf/getJtspSingle")
	public Optional<JfTrnSofParameters> getJtphSingle(String sof, Integer ver, Integer seq){
		return servJTSP.getJtphSingle(sof, ver, seq);
	}
	
	
}
