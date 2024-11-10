package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.TrMstCounterpartiesV;
import com.JointFinance.Repository.ITrMstCounterpartiesVRepository;
@Service
public class ServiceTrMstCounterpartiesV {

	@Autowired
	ITrMstCounterpartiesVRepository repoTMCV;

	public List<TrMstCounterpartiesV> getTmcvAll(){
		return repoTMCV.findAll();
	}
	
	public List<TrMstCounterpartiesV> getTmcvCpCode(String cpcode){
		return repoTMCV.findByTmcvCpCode(cpcode);
	}
}
