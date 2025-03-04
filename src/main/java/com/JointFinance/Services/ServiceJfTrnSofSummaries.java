package com.JointFinance.Services;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnSofSummaries;
import com.JointFinance.Repository.IJfTrnSofSummariesRepository;

@Service
public class ServiceJfTrnSofSummaries {
	@Autowired
	IJfTrnSofSummariesRepository repoSofSummaries;
	
	public List<JfTrnSofSummaries> getAllSofSummaries() {
		return repoSofSummaries.findAll();
	}
	
	public List<JfTrnSofSummaries> findBySofDate(Date sofDate) {
		System.out.println("Simulation Date = " + sofDate);
		return repoSofSummaries.findBySofDate(sofDate, sofDate);
	}
	
	public List<JfTrnSofSummaries> findByJtssSofDateAndJtssApproveStatus(Date sofDate, String approveStatus) {
		return repoSofSummaries.findByJtssSofDateAndJtssApproveStatus(sofDate, approveStatus);
	}
	
	public String procGenJF(String p_userid, Date p_simdate) {
		System.out.println("Simulation Date = " + p_simdate);
		return repoSofSummaries.procGenJF(p_userid, p_simdate);
	}
	
	public String procSimJF(String p_userid, Date p_simdate) {
		System.out.println("Simulation Date = " + p_simdate);
		return repoSofSummaries.procSimJF(p_userid, p_simdate);
	}
	
	public String procSimJF(String p_sof_code, Integer p_top_id, Date p_simdate, BigDecimal p_adjusment_amt, String p_sof_code_target, String p_userid) {
		return repoSofSummaries.procSimJF(p_sof_code, p_top_id, p_simdate, p_adjusment_amt, p_sof_code_target, p_userid);
	}
	
	public String procAprvJF(String p_userid, String p_sof_code, Integer p_top_id, Date p_simdate, Date p_disb_plan_date) {
		return repoSofSummaries.procAprvJF(p_userid, p_sof_code, p_top_id, p_simdate, p_disb_plan_date);
	}
	
	public String saveApproveJF(List<JfTrnSofSummaries> jfTrnSofSummaries) {
		repoSofSummaries.saveAll(jfTrnSofSummaries);
		return "Approve Process Success.";
	}
	
	public BigDecimal getTotFifPct(String sofCode, Date sofDate, Integer topId) {
		return repoSofSummaries.getTotFifPct(sofCode, sofDate, topId);
	}
	
	public BigDecimal getTotJfPortion(Date simDate) {
		return repoSofSummaries.getTotJfPortion(simDate);
	}
}