package com.JointFinance.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VLovSofTarget;
import com.JointFinance.Repository.IVLovSofTargetRepository;

@Service
public class ServiceVLovSofTarget {
	@Autowired
	IVLovSofTargetRepository repoLovSofTarget;
	
	public List<VLovSofTarget> getListVLovSofTarget() {
		return repoLovSofTarget.findAll();
	}
}
