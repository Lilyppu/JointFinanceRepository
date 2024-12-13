package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfMstSoftcopies;
import com.JointFinance.Services.ServiceJfMstSoftcopies;

@RestController
public class ControllerJfMstSoftcopies {

	@Autowired
	ServiceJfMstSoftcopies servJMSC;
	
	@GetMapping("/jf/getJmscAll")
	public List<JfMstSoftcopies> getJmscAll(){
		return servJMSC.getJmscAll();
	}
	
	@GetMapping("/jf/getByJmscSoftcopyCodeList")
	public List<JfMstSoftcopies> getByJmscSoftcopyCodeList(String softcopycode){
		return servJMSC.getByJmscSoftcopyCodeList(softcopycode);
	}
	
	@GetMapping("/jf/getJmscSoftcopyCodeCU")
	public Optional<JfMstSoftcopies> getJmscSoftcopyCodeCU(String softcopycode){
		return servJMSC.getJmscSoftcopyCodeCU(softcopycode);
	}
	
	@PostMapping("/jf/saveUpdateJfMstSoftcopies")
	public String saveUpdateJfMstSoftcopies(@RequestBody JfMstSoftcopies jmsc) {
		return servJMSC.saveUpdateJfMstSoftcopies(jmsc);
	}
	
	@GetMapping("/jf/getDelBySoftcopyCode")
	public String getDelBySoftcopyCode(String softcopycode) {
		servJMSC.getDelBySoftcopyCode(softcopycode);
		return "Delete Successfully";
	}
	
}
