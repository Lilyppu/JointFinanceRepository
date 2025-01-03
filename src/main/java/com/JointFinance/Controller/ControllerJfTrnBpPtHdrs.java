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
	
	@GetMapping("/jf/getJtbphSingle")
	public Optional<JfTrnBpPtHdrs> getJtbphSingle(String ptno){
		return servJTBPH.getJtbpdSingle(ptno);
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
	
	@PostMapping("/jf/saveupdJtbph")
	public String SaveUpdJtbph(@RequestBody JfTrnBpPtHdrs jtbph) {
		return servJTBPH.SaveUpdJtbph(jtbph);
	}
	
	@GetMapping("/jf/runPtApprove")
	public String runProcessApprove(String pdate , String ptno , String ptstatus, String puserid ) {
		return servJTBPH.runProcessApprove(pdate, ptno, ptstatus, puserid);
	}
	
	@GetMapping("/jf/runPtCancel")
	public String runProcessCancel(String pdate , String ptno , String ptstatus, String puserid ) {
		return servJTBPH.runProcessCancel(pdate, ptno, ptstatus, puserid);
	}
	
	@GetMapping("/jf/runPtProcess")
	public String runProcessProcess(String pdate , String ptno , String ptstatus, String puserid ) {
		return servJTBPH.runProcessProcess(pdate, ptno, ptstatus, puserid);
	}
	

}
