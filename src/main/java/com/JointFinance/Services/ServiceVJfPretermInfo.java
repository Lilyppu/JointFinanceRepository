package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfPretermInfo;
import com.JointFinance.Repository.IVJfPretermInfoRepository;

@Service
public class ServiceVJfPretermInfo {
	@Autowired
	IVJfPretermInfoRepository repoVJPtI;
	
	public  Optional<VJfPretermInfo> getVjpti (String ptno, String sof)
	{
		return repoVJPtI.findByVjptiNoAndVjptiSofNo(ptno, sof);
	}
	
	
	
}
