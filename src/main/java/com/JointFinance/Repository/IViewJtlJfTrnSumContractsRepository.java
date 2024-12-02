package com.JointFinance.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.ViewJtlJfTrnSumContracts;
import com.JointFinance.Models.ViewJtlJfTrnSumContractsCompKey;

@Repository
public interface IViewJtlJfTrnSumContractsRepository extends JpaRepository <ViewJtlJfTrnSumContracts, ViewJtlJfTrnSumContractsCompKey>{

	@Query(value="SELECT sof_code, contract_no, NULL inst_no, NULL ktp_cust_name, contract_status, "
			+ "letter_no, pv_letter_no, (NVL (prnc_amt, 0) - NVL (prnc_amt_paid, 0)) prnc_amount, "
			+ "(NVL (intr_amt, 0) - NVL (intr_amt_paid, 0)) intr_amount, "
			+ "((NVL (prnc_amt, 0) - NVL (prnc_amt_paid, 0)) + (NVL (intr_amt, 0) - NVL (intr_amt_paid, 0))) installment "
			+ "FROM jf_trn_sum_contracts WHERE sof_code = :pSofCode AND letter_no = :pLetterNo "
			+ "AND contract_status NOT IN ('CL', 'RJ')", nativeQuery = true)
	List<ViewJtlJfTrnSumContracts> getJtlJtscList1(String pSofCode, String pLetterNo);	
	
	@Query(value="SELECT a.sof_code, a.contract_no, NULL inst_no, NULL ktp_cust_name, a.contract_status, "
			+ "a.letter_no, a.pv_letter_no, (NVL (a.prnc_amt, 0) - NVL (a.prnc_amt_paid, 0)) prnc_amount, "
			+ "(NVL (a.intr_amt, 0) - NVL (a.intr_amt_paid, 0)) intr_amount, "
			+ "((NVL (a.prnc_amt, 0) - NVL (a.prnc_amt_paid, 0)) + (NVL (a.intr_amt, 0) - NVL (a.intr_amt_paid, 0))) installment "
			+ "FROM jf_trn_sum_contracts a, (SELECT b.sof_code, b.contract_no, b.inst_no, NULL ktp_cust_name, NULL contract_status, "
			+ "b.letter_no, NULL pv_letter_no, NVL (b.prnc_amt, 0) prnc_amount, "
			+ "(NVL (b.days_intr_amt, 0) + NVL (b.ovd_intr_amt, 0)) intr_amount, "
			+ "(NVL (b.prnc_amt, 0) + NVL (b.days_intr_amt, 0) + NVL (b.ovd_intr_amt, 0)) installment "
			+ "FROM jf_trn_pretermination b) WHERE a.sof_code = :pSofCode AND a.letter_no = :pLetterNo", nativeQuery = true)
	List<ViewJtlJfTrnSumContracts> getJtlJtscList2(String pSofCode, String pLetterNo);	
	
}
