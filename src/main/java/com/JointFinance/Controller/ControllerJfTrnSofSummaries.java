package com.JointFinance.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnSofSummaries;
import com.JointFinance.Services.ServiceJfTrnSofSummaries;


@RestController
public class ControllerJfTrnSofSummaries {
	@Autowired
	ServiceJfTrnSofSummaries serviceSofSummaries;
	
	@GetMapping("/jf/getListDisburseSimulation")
	public List<JfTrnSofSummaries> findBySofDate(Date sofDate) {
		return serviceSofSummaries.findBySofDate(sofDate);
	}
	
	@GetMapping("/jf/getListAprvDisburseSimulation")
	public List<JfTrnSofSummaries> findByJtssSofDateAndJtssApproveStatus(Date sofDate, String approveStatus) {
		return serviceSofSummaries.findByJtssSofDateAndJtssApproveStatus(sofDate, approveStatus);
	}
	
	@GetMapping(path = "/jf/ProcGenJf")
    public String procGenJF(String p_userid, Date p_simdate) {
		return serviceSofSummaries.procGenJF(p_userid, p_simdate);
	}
	
	@GetMapping(path = "/jf/ProcSimJf")
    public String procSimJF(String p_userid, Date p_simdate) {
		return serviceSofSummaries.procSimJF(p_userid, p_simdate);
	}
	
	@PostMapping(path = "/jf/ApproveJf")
    public String procAprvJF(@RequestBody List<JfTrnSofSummaries> jfTrnSofSummaries) {
		return serviceSofSummaries.saveApproveJF(jfTrnSofSummaries);
	}
	
	@GetMapping(path = "/jf/getTotFifPct")
    public Double getTotFifPct(String sofCode, Date sofDate, int topId) {
		return serviceSofSummaries.getTotFifPct(sofCode, sofDate, topId);
	}
	
	@GetMapping(path = "/jf/getTotJfPortion")
    public Double getTotJfPortion(Date simDate) {
		return serviceSofSummaries.getTotJfPortion(simDate);
	}
}
