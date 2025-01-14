package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTmpSofIntrRates;
import com.JointFinance.Models.JfTmpSofIntrRatesCompKey;

public interface IJfTmpSofIntrRatesRepository extends JpaRepository<JfTmpSofIntrRates,JfTmpSofIntrRatesCompKey>{
	
	public Optional<JfTmpSofIntrRates> findByJtmsirSofCodeAndJtmsirSeqNo(String sofcode, Integer seqno);
	
	public List<JfTmpSofIntrRates> findByJtmsirSofCode(String sofcode);
	
	@Procedure(procedureName = "JF_P_APPROVE_INTR_RATES")
	public String procApproveIntrRates(String p_userid);
	
}
