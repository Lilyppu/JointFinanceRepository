package com.JointFinance.Repository;

import java.util.List;
import java.util.Date;
import java.util.Optional;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.VJfOthersInfoPutback;
public interface IVJfOthersInfoPutbackRepository extends JpaRepository<VJfOthersInfoPutback,String>{
	
	public Optional<VJfOthersInfoPutback> findByVjoiPbContractNo(String contractno);
	
	@Procedure(procedureName = "TREASURY.P_GET_JF_OTHERS_INFO_PUTBACK")
	public String getOthersInfoPutback(String pi_contract);
	
	/*
	@Procedure(procedureName = "TREASURY.P_GET_JF_OTHERS_INFO_PUTBACK")
	public String getOthersInfoPutback(String pi_contract, String po_contract_no, String po_letter_no, Date po_letter_date, BigDecimal po_prnc_amt_fif_by_cp);
	*/
}
