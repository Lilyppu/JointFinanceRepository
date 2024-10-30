package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnSofHdrs;
import com.JointFinance.Services.ServiceJfTrnSofHdrs;


@RestController
public class ControllerJfTrnSofHdrs {
	@Autowired
	ServiceJfTrnSofHdrs servJTSH;
	
	@GetMapping("/jf/getJtshAll")
	public List<JfTrnSofHdrs> getJtshAll(){
		return servJTSH.getJtshAll();
	}
	
	@GetMapping("/jf/getJtshSingle")
	public Optional<JfTrnSofHdrs> getJtshSingle(String code){
		return servJTSH.getJtshSingle(code);
	}
	
	@GetMapping("/jf/getJtshBySofCode")
	public List<JfTrnSofHdrs> getJtshBySofcode(String code){
		return servJTSH.getJtshBySofcode(code);
	}
	
	@GetMapping("/jf/getJtshByAlias")
	public List<JfTrnSofHdrs> getJtshByAlias(String alias){
		return servJTSH.getJtshByAlias(alias);
	}
	
	@GetMapping("/jf/getJtshStatus")
	public List<JfTrnSofHdrs> getJtshByStatus(String status){
		return servJTSH.getJtshByStatus(status);
	}
	
	@GetMapping("/jf/getJtshByPlatform")
	public List<JfTrnSofHdrs> getJtshByPlatform(String platform){
		return servJTSH.getJtshByPlatform(platform);
	}
	
	@PostMapping("/jf/saveupdateSofHdr")
	public String saveUpdateTrSofHdrs(@RequestBody JfTrnSofHdrs sofhdr) {
		return servJTSH.saveUpdateTrSofHdrs(sofhdr);
	}
	

}
