package com.JointFinance.Controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping(path = "/jf/P_SIMJF")
    public String procSimJF(String p_sof_code, Integer p_top_id, Date p_simdate, BigDecimal p_adjusment_amt, String p_sof_code_target, String p_userid) {
		return serviceSofSummaries.procSimJF(p_sof_code, p_top_id, p_simdate, p_adjusment_amt, p_sof_code_target, p_userid);
	}
	
	@GetMapping(path = "/jf/P_APPJF")
    public String procAprvJF(String p_userid, String p_sof_code, Integer p_top_id, Date p_simdate, Date p_disb_plan_date) {
		return serviceSofSummaries.procAprvJF(p_userid, p_sof_code, p_top_id, p_simdate, p_disb_plan_date);
	}
	
	@GetMapping(path = "/jf/getTotFifPct")
    public BigDecimal getTotFifPct(@RequestParam String sofCode, @RequestParam Date sofDate, @RequestParam Integer topId) {
		return serviceSofSummaries.getTotFifPct(sofCode, sofDate, topId);
	}
	
	@GetMapping(path = "/jf/getTotJfPortion")
    public BigDecimal getTotJfPortion(@RequestParam Date simDate) {
		return serviceSofSummaries.getTotJfPortion(simDate);
	}
}
