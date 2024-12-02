package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.LovJtlGroupCode;
import com.JointFinance.Repository.ILovJtlGroupCodeRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerLovJtlGroupCode {
	
	@Autowired
	ILovJtlGroupCodeRepository servJTLGC;
	
	@GetMapping("/jf/getGroupCodeList")
	public List<LovJtlGroupCode> getGroupCodeList(String pLetterType){
		return servJTLGC.findJtlGrpCodeByLetterType(pLetterType);
	}

}
