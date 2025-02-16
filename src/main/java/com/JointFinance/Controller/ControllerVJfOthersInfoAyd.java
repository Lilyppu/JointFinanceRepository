package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.VJfOthersInfoAyd;
import com.JointFinance.Services.ServiceVJfOthersInfoAyd;

@RestController
public class ControllerVJfOthersInfoAyd {
	@Autowired
	ServiceVJfOthersInfoAyd servVJOIA;
	
	@GetMapping("/jf/getVjoiaAll")
	public List<VJfOthersInfoAyd> getVjoiaAll(){
		return servVJOIA.getVjoiaAll();
	}
	
	@GetMapping("/jf/getVjoiByAydContractNoCU")
	public Optional<VJfOthersInfoAyd> getVjoiByAydContractNoCU(String contractno){
		return servVJOIA.getVjoiByAydContractNoCU(contractno);
	}
}
