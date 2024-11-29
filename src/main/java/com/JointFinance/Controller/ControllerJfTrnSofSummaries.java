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
	
	@GetMapping("/jf/getJfTrnSofSummaries")
	public List<JfTrnSofSummaries> getListJfTrnSofSummariesBySofDate(Date sofDate) {
		return serviceSofSummaries.getListJfTrnSofSummariesBySofDate(sofDate);
	}
}
