package com.JointFinance.Models;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Services.ServiceJfTrnBpPtDtls;
import com.JointFinance.Services.ServiceJfTrnBpPtHdrs;

@RestController
public class ControllerJfTrnBpPtDtls {
	@Autowired
	ServiceJfTrnBpPtDtls servJTBPD;
}
