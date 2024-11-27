package com.JointFinance.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Models.JfTrnSofSummaries;
import com.JointFinance.Services.ServiceJfTrnSofSummaries;

@RestController
public class ControllerJfTrnSofSummaries {
	@Autowired
	ServiceJfTrnSofSummaries serviceSofSummaries;
	
	@GetMapping("/jf/getDisburseSimulation")
	public List<JfTrnSofSummaries> getListJfTrnSofSummariesBySofDate(Date sofDate) {
		return serviceSofSummaries.getListJfTrnSofSummariesBySofDate(sofDate);
	}
	
	@GetMapping("/jf/getAprvDisbSimulation")
	public List<JfTrnSofSummaries> getListJfTrnSofSummariesBySofDateStatus(Date jtssSofDate, String jtssApproveStatus) {
		return serviceSofSummaries.getListJfTrnSofSummariesBySofDateStatus(jtssSofDate, jtssApproveStatus);
	}
	
	@GetMapping(path = "/jf/ProcGenJf")
    public String procGenJF(String p_userid, Date p_simdate) {
		return serviceSofSummaries.procGenJF(p_userid, p_simdate);
	}
	
	@GetMapping(path = "/jf/ProcSimJf")
    public String procSimJF(String p_userid, Date p_simdate) {
		return serviceSofSummaries.procSimJF(p_userid, p_simdate);
	}
}
