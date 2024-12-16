package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JFTrnSofCps;
import com.JointFinance.Models.JfTrnSofParamDtls;
import com.JointFinance.Services.ServiceJfTrnSofParamDtls;

@RestController
public class ControllerJfTrnSofParamDtls {
	@Autowired
	ServiceJfTrnSofParamDtls servJTSPD;
	
	@GetMapping("/jf/getJtspdAll")
	public List<JfTrnSofParamDtls> getJtspdAll(){
		return servJTSPD.getJtspdAll();
	}
	
	@GetMapping("/jf/getJtspdList")
	public List<JfTrnSofParamDtls> getJtspdList(String sof, Integer ver, Integer seq){
		return servJTSPD.getJtspdList(sof, ver, seq);
	}
	
	@GetMapping("/jf/getJtspdSingle")
	public Optional<JfTrnSofParamDtls> getJtspdSingle(String sof, Integer ver, Integer seq, String off){
		System.out.println("aaaaa :"+sof+"-"+ver+"-"+seq+"-"+off);
		return servJTSPD.getJtspdSingle(sof, seq, seq, off);
	}
	
	@PostMapping("/jf/saveupdateJtspd")
	public String SaveUpdJtspd(@RequestBody JfTrnSofParamDtls jtdpd) {		
		return servJTSPD.SaveUpdJtspd(jtdpd);
	}

}
