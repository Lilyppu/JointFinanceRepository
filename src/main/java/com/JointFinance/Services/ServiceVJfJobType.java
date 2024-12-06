package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfJobType;
import com.JointFinance.Repository.IVJfJobTypeRepository;
@Service
public class ServiceVJfJobType {

	IVJfJobTypeRepository repoVjjt;
	
	public List<VJfJobType> getJobTypeList(){
		return repoVjjt.findAll();
	}
	
}
