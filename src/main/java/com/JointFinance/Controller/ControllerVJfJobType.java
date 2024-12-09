package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.VJfJobType;
import com.JointFinance.Services.ServiceVJfJobType;



@RestController
public class ControllerVJfJobType {
	@Autowired
	ServiceVJfJobType servVjjt;
	
	@GetMapping("/jf/getJobTypeList")
	public List<VJfJobType> getJobTypeList(){
		return servVjjt.getJobTypeList();
	}
}
