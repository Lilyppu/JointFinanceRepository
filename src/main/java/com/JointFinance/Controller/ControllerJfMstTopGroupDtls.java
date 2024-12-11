package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfMstTopGroupDtls;
import com.JointFinance.Services.ServiceJfMstTopGroupDtls;

@RestController
public class ControllerJfMstTopGroupDtls {

	@Autowired
	ServiceJfMstTopGroupDtls servJMTGD;
	
	@GetMapping("/jf/getJmtgdAll")
	public List<JfMstTopGroupDtls> getJmtgdAll(){
		return servJMTGD.getJmtgdAll();
	}
	
	@GetMapping("/jf/getByJmtgdTopId")
	public List<JfMstTopGroupDtls> getByJmtgdTopId(Integer topid){
		return servJMTGD.getByJmtgdTopId(topid);
	}
	
	@PostMapping("/jf/saveupdateJfMstTopGroupDtls")
	public String saveUpdateJfMstTopGroupDtls(@RequestBody JfMstTopGroupDtls jmtgd) {
		return servJMTGD.saveUpdateJfMstTopGroupDtls(jmtgd);
	}
	
	@GetMapping("/jf/DelJmtgdSingle")
	public String getDelByJmtgdTopId(Integer topid, String sofcode) {
		servJMTGD.getDelByJmtgdTopId(topid, sofcode);
		return "Delete Successfully";
	}
	
	@GetMapping("/jf/insAllSofCode")
	public String insAllSofCode(Integer topid) {
		return servJMTGD.insAllSofCode(topid);
	}
}
