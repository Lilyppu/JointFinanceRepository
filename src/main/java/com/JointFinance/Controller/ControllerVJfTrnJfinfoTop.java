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

import com.JointFinance.Models.VJfTrnJfinfoTop;
import com.JointFinance.Services.ServiceVJfTrnJfinfoTop;


@RestController
public class ControllerVJfTrnJfinfoTop {
	
	@Autowired
	ServiceVJfTrnJfinfoTop servVJTJT;
	
	@GetMapping("/jf/getVjtjtAll")
	public List<VJfTrnJfinfoTop> getVjtjtAll(){
		return servVJTJT.getVjtjtAll();
	}
	
	@GetMapping("/jf/getVjtjtByContractNoCU")
	public Optional<VJfTrnJfinfoTop> getVjtjtByContractNoCU(String contractno){
		return servVJTJT.getVjtjtByContractNoCU(contractno);
	}
	
	@GetMapping("/jf/jfinfo")
	public ResponseEntity<List<VJfTrnJfinfoTop>> getJFInfo() {
	    try {
	        List<VJfTrnJfinfoTop> infoList = servVJTJT.getVjtjtAll();
	        return ResponseEntity.ok(infoList);
	    } catch (Exception e) {
	        // Log the exception
	        System.err.println("Error retrieving JF Info: " + e.getMessage());
	        e.printStackTrace();
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	    }
	}
}
