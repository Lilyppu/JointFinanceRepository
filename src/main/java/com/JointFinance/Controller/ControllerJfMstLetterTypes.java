package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfMstLetterTypes;
import com.JointFinance.Services.ServiceJfMstLetterTypes;

@RestController
public class ControllerJfMstLetterTypes {
	
	@Autowired
	ServiceJfMstLetterTypes servJMLT;
	
	@GetMapping("/jf/getJmltAll")
	public List<JfMstLetterTypes> getJmltAll(){
		return servJMLT.getJmltAll();
	}
	
	@GetMapping("/jf/getJmltByType")
	public List<JfMstLetterTypes> getJmltByType(String pLetterType){
		return servJMLT.getJmltByType(pLetterType);
	}

}
