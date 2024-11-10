package com.JointFinance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.JointFinance.Models.TrCounterpartyBranchV;
import com.JointFinance.Services.ServiceTrCounterpartyBranchV;

@RestController
public class ControllerTrCounterpartyBranchV {

	@Autowired
	ServiceTrCounterpartyBranchV servTCBV;
    
	@GetMapping("/tr/getTcbvAll")
	public List<TrCounterpartyBranchV> getTcbvAll(){
		return servTCBV.getTcbvAll();
	}
}
