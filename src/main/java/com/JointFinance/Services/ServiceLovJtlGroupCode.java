package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.LovJtlGroupCode;
import com.JointFinance.Repository.ILovJtlGroupCodeRepository;

@Service
public class ServiceLovJtlGroupCode {
	
	@Autowired
	ILovJtlGroupCodeRepository repoLJTLGC;
	
	public List<LovJtlGroupCode> findJtlGrpCodeByLetterType(String pLetterType){
		return repoLJTLGC.findJtlGrpCodeByLetterType(pLetterType);
	}

}
