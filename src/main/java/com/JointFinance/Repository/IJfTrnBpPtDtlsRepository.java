package com.JointFinance.Repository;
import java.math.BigDecimal;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnBpPtDtls;
import com.JointFinance.Models.JfTrnBpPtDtlsCompKey;


@Repository
public interface IJfTrnBpPtDtlsRepository extends JpaRepository<JfTrnBpPtDtls,JfTrnBpPtDtlsCompKey>{

	public List<JfTrnBpPtDtls> findByJtbpdNo(String ptno);
	
	@Procedure(procedureName = "P_JF_PRETERMDTL_INSERT")
	public String runProses(String ptno, String psofcode, String pcontractno, String premark, String puser,  BigDecimal pdayintr, BigDecimal padmin );	
	

}
