package com.JointFinance.Services;

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
	
	public String saveApproveJF(List<JfTrnSofSummaries> jfTrnSofSummaries) {
		repoSofSummaries.saveAll(jfTrnSofSummaries);
		return "Approve Process Success.";
	}
	
	public Double getTotFifPct(String sofCode, Date sofDate, int topId) {
		return repoSofSummaries.getTotFifPct(sofCode, sofDate, topId);
	}
	
	public Double getTotJfPortion(Date simDate) {
		return repoSofSummaries.getTotJfPortion(simDate);
	}
}