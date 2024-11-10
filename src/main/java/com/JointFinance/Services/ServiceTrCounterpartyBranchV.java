package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.TrCounterpartyBranchV;
import com.JointFinance.Repository.ITrCounterpartyBranchVRepository;
@Service
public class ServiceTrCounterpartyBranchV {
	@Autowired
	ITrCounterpartyBranchVRepository repoTCBV;

	public List<TrCounterpartyBranchV> getTcbvAll(){
		return repoTCBV.findAll();
	}

}
