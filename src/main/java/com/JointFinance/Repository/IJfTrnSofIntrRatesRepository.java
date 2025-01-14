package com.JointFinance.Repository;


import java.util.Date;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnSofIntrRates;
import com.JointFinance.Models.JfTrnSofIntrRatesCompKey;

public interface IJfTrnSofIntrRatesRepository extends JpaRepository<JfTrnSofIntrRates,JfTrnSofIntrRatesCompKey>{

	public Optional<JfTrnSofIntrRates> findByJtsirSofCodeAndJtsirSeqno(String code, Integer seq);
	
	public List<JfTrnSofIntrRates> findByJtsirSofCode(String sof);
	
}
