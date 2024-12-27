package com.JointFinance.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnSofDailyTargets;
import com.JointFinance.Repository.IJfTrnSofDailyTargetsRepository;

@Service
public class ServiceJfTrnSofDailyTargets {
	@Autowired
	IJfTrnSofDailyTargetsRepository repoSofDailyTargets;
	
	public List<JfTrnSofDailyTargets> findBySofCode(String jtsdtSofCode) {
		return repoSofDailyTargets.findByJtsdtSofCode(jtsdtSofCode);
	}
}
