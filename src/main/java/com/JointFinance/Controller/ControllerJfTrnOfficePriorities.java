package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnOfficePriorities;
import com.JointFinance.Models.JfTrnSofHdrs;
import com.JointFinance.Services.ServiceJfTrnOfficePriorities;
import com.JointFinance.Services.ServiceJfTrnSofHdrs;

@RestController
public class ControllerJfTrnOfficePriorities {
	@Autowired
	ServiceJfTrnOfficePriorities ServJTOP;
	
	@GetMapping("/jf/getJtopAll")
	public List<JfTrnOfficePriorities> getJtopAll(){
		return ServJTOP.getJtopAll();
	}
	
	@GetMapping("/jf/getJtopSingle")
	public Optional<JfTrnOfficePriorities> getJtopSingle( String sof, String off){
		return ServJTOP.getJtopSingle(sof, off);
	}
	
	@GetMapping("/jf/getJtopBySofCode")
	public List<JfTrnOfficePriorities> getJtopBySofCode( String sof){
		return ServJTOP.getJtopBySofCode(sof);
	}
	
	@PostMapping("/jf/saveUpdateJtop")
	public String updateSaverJtop(@RequestBody JfTrnOfficePriorities jtop){
		return ServJTOP.updateSaverJtop(jtop);
	}
	
}
