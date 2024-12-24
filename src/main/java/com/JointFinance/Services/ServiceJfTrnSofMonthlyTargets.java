package com.JointFinance.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnSofMonthlyTargets;
import com.JointFinance.Repository.IJfTrnSofMonthlyTargetsRepository;

@Service
public class ServiceJfTrnSofMonthlyTargets {
	@Autowired
	IJfTrnSofMonthlyTargetsRepository repoSofMonthlyTargets;
	
	public List<JfTrnSofMonthlyTargets> findBySofCode(String sofCode) {
		return repoSofMonthlyTargets.findBySofCode(sofCode);
	}
}
