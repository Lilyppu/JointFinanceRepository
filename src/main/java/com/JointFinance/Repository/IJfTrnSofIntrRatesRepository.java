package com.JointFinance.Repository;


import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import com.JointFinance.Models.JfTrnSofIntrRates;
import com.JointFinance.Models.JfTrnSofIntrRatesCompKey;

public interface IJfTrnSofIntrRatesRepository extends JpaRepository<JfTrnSofIntrRates,JfTrnSofIntrRatesCompKey>{

	public Optional<JfTrnSofIntrRates> findByJtsirSofCodeAndJtsirSeqno(String code, Integer seq);
	
	public List<JfTrnSofIntrRates> findByJtsirSofCode(String sof);
	
	 @Query(value = "SELECT F_CALCULATE_COF(:p_sof_code, :p_seq_no, :p_top, :p_ots_prnc_amt) FROM dual", nativeQuery = true)
	    BigDecimal F_CALCULATE_COF(
	        @Param("p_sof_code") String sofCode,
	        @Param("p_seq_no") Integer seqNo,
	        @Param("p_top") Integer top,
	        @Param("p_ots_prnc_amt") BigDecimal otsPrncAmt
	    );
}
