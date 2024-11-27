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
	
	public List<JfTrnSofSummaries> getListJfTrnSofSummariesBySofDate(Date sofDate) {
		return repoSofSummaries.getListJfTrnSofSummariesBySofDate(sofDate, sofDate);
	}
	
	public List<JfTrnSofSummaries> getListJfTrnSofSummariesBySofDateStatus(Date jtssSofDate, String jtssApproveStatus) {
		return repoSofSummaries.getListJfTrnSofSummariesBySofDateStatus(jtssSofDate, jtssApproveStatus);
	}
	
	public String procGenJF(String p_userid, Date p_simdate) {
		return repoSofSummaries.procGenJF(p_userid, p_simdate);
	}
	
	public String procSimJF(String p_userid, Date p_simdate) {
		return repoSofSummaries.procSimJF(p_userid, p_simdate);
	}
}