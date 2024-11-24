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
}