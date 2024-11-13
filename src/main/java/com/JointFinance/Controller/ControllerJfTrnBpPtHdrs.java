package com.JointFinance.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnBpPtHdrs;
import com.JointFinance.Services.ServiceJfTrnBpPtHdrs;

@RestController
public class ControllerJfTrnBpPtHdrs {
	@Autowired
	ServiceJfTrnBpPtHdrs servJTBPH;
	
	@GetMapping("/jf/getJtbphlList")
	public List<JfTrnBpPtHdrs> getJtbpdList(){
		return servJTBPH.getJtbpdList();
	}
	
	@GetMapping("/jf/getJtbphByPtNo")
	public List<JfTrnBpPtHdrs> getJtbpdByPtNo(String ptno){
		return servJTBPH.getJtbpdByPtNo(ptno);
	}
	
	@GetMapping("/jf/getJtbphByStatus")
	public List<JfTrnBpPtHdrs> getJtbpdByStatus(String Sta){
		return servJTBPH.getJtbpdByStatus(Sta);
	}
	
	@GetMapping("/jf/getJtbphBySofCode")
	public List<JfTrnBpPtHdrs> getJtbpdBySofCode(String sof){
		return servJTBPH.getJtbpdBySofCode(sof);
	}
	

}
