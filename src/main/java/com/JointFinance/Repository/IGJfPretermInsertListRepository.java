package com.JointFinance.Repository;
import java.math.BigDecimal;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Controller.GJfPretermInsertList;
import com.JointFinance.Models.GJfPretermInsertListCompKey;
import com.JointFinance.Models.JfTrnLetters;
import com.JointFinance.Models.VJfPretermInfo;

@Repository
public interface IGJfPretermInsertListRepository extends JpaRepository<GJfPretermInsertList,GJfPretermInsertListCompKey>{
	@Procedure(procedureName = "P_JF_PRETERM_INSERT_LIST")
	public String runInsertList(String pdate , String psofcode , Integer ptop, Integer povd , BigDecimal prateminr, BigDecimal pprincmin );

	public List<GJfPretermInsertList> findByGjptilSofCode(String sof);
}
