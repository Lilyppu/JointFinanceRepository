package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnSofSoftcopies;
import com.JointFinance.Services.ServiceJfTrnSofSoftcopies;

@RestController
public class ControllerJfTrnSofSoftcopies {

	@Autowired
	ServiceJfTrnSofSoftcopies servJTSS;
	
	@GetMapping("/jf/getJtssAll")
	public List<JfTrnSofSoftcopies> getJtssAll(){
		return servJTSS.getJtssAll();
	}
	
	@GetMapping("/jf/getByJtssSofCodeList")
	public List<JfTrnSofSoftcopies> getByJtssSofCodeList(String sofcode){
		return servJTSS.getByJtssSofCodeList(sofcode);
	}
	
	@GetMapping("/jf/getJtssSofCodeAndSoftcopySeqNoCU")
	public Optional<JfTrnSofSoftcopies> getJtssSofCodeAndSoftcopySeqNoCU(String sofcode, Integer softcopyseqno){
		return servJTSS.getJtssSofCodeAndSoftcopySeqNoCU(sofcode,softcopyseqno);
	}
	
	@PostMapping("/jf/saveUpdateJfTrnSofSoftcopies")
	public String saveUpdateJfTrnSofSoftcopies(@RequestBody JfTrnSofSoftcopies jtss) {
		return servJTSS.saveUpdateJfTrnSofSoftcopies(jtss);
	}
	
	@GetMapping("/jf/getDelJtss")
	public String getDelJtss(String sofcode, Integer softcopyseqno) {
		servJTSS.getDelJtss(sofcode,softcopyseqno);
		return "Delete Successfully";
	}
}
