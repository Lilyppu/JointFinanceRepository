package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfMstTopGroups;
import com.JointFinance.Services.ServiceJfMstTopGroups;

@RestController
public class ControllerJfMstTopGroups {

	@Autowired
	ServiceJfMstTopGroups servJMTG;
	
	@GetMapping("/jf/getJmtgAll")
	public List<JfMstTopGroups> getJmtgAll(){
		return servJMTG.getJmtgAll();
	}
	
	@GetMapping("/jf/getByJmtgTopId")
	public List<JfMstTopGroups> getByJmtgTopId(Integer topid){
		return servJMTG.getByJmtgTopId(topid);
	}
	
	@GetMapping("/jf/getJmtgByTopIdSingle")
	public Optional<JfMstTopGroups> getJmtgByTopIdSingle(Integer topid){
		return servJMTG.getJmtgByTopIdSingle(topid);
	}
	
	@PostMapping("/jf/saveUpdateJfMstTopGroups")
	public String saveUpdateJfMstTopGroups(@RequestBody JfMstTopGroups jmtgd) {
		return servJMTG.saveUpdateJfMstTopGroups(jmtgd);
	}
	
	@GetMapping("/jf/DelJmtgSingle")
	public String getDelJmtgById(Integer topid) {
		servJMTG.getDelJmtgById(topid);
		return "Delete Successfully";
	}
}
