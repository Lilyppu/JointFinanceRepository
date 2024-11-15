package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Repository.IJfTrnLettersRepository;

@Service
public class ServiceJfTrnLetters {
	
	@Autowired
	IJfTrnLettersRepository repoJTL;
	
	public List getJtlList(String pLetterType, String pCpCode, String pSofCode, String pGroupCode) {
		return repoJTL.getJtlList(pLetterType, pCpCode, pSofCode, pGroupCode);
	}
	
	public String runConfirmProcess(String pLetterNo, String pLetterType, String pGroupCode, Integer pPerhitBank, Integer pPerhitFif, String pUserId) {
		return repoJTL.runProses(pLetterNo, pLetterType, pGroupCode, pPerhitBank, pPerhitFif, pUserId);
	}
	
	public String runResetSof(String pLetterNo, String pSofCode, String pUserId) {
		return repoJTL.runResetSof(pLetterNo, pSofCode, pUserId);
	}

}
