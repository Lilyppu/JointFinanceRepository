package com.JointFinance.Services;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.VJfOthersInfoPutback;
import com.JointFinance.Repository.IVJfOthersInfoPutbackRepository;

@Service
public class ServiceVJfOthersInfoPutback {
	@Autowired
	IVJfOthersInfoPutbackRepository repoVJOIP;
	
	public List<VJfOthersInfoPutback> getVjoipAll(){
		return repoVJOIP.findAll();
	}
	
	public Optional<VJfOthersInfoPutback> getByVjoiPbContractNo(String contractNo) {
        return repoVJOIP.findByVjoiPbContractNo(contractNo);
    }
	
	public String getOthersInfoPutback (String pi_contract) {
		return repoVJOIP.getOthersInfoPutback(pi_contract);
	}
	
	/*
	public String getOthersInfoPutback (String pi_contract, String po_contract_no, String po_letter_no, Date po_letter_date, BigDecimal po_prnc_amt_fif_by_cp) {
		return repoVJOIP.getOthersInfoPutback(pi_contract, po_contract_no, po_letter_no, po_letter_date, po_prnc_amt_fif_by_cp);
	}
	*/
}
