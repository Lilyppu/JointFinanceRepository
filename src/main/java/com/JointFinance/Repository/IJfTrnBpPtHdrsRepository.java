package com.JointFinance.Repository;

import java.math.BigDecimal;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnBpPtHdrs;
import com.JointFinance.Models.JfTrnLetters;

@Repository
public interface IJfTrnBpPtHdrsRepository extends JpaRepository<JfTrnBpPtHdrs,String> {
	
	@Query(value="SELECT aa.* FROM JF_TRN_BP_PT_HDRS AA WHERE EXISTS (SELECT 1 FROM V_JF_PRETERM_RANGE_VIEW BB WHERE BB.PT_NO=AA.PT_NO)", nativeQuery = true )
    List<JfTrnBpPtHdrs> getJtbphAll();
	
	@Query(value="SELECT aa.* FROM JF_TRN_BP_PT_HDRS AA WHERE PT_NO =:ptno AND EXISTS (SELECT 1 FROM V_JF_PRETERM_RANGE_VIEW BB WHERE BB.PT_NO=AA.PT_NO)", nativeQuery = true )
	public List<JfTrnBpPtHdrs> getJtbphByNo(String ptno);
	
	@Procedure(procedureName = "JF_PRETERM_PROCESS_PKG.pt_approve")
	public String runProcessApprove(String pdate , String ptno , String ptstatus, String puserid );
	
	@Procedure(procedureName = "JF_PRETERM_PROCESS_PKG.pt_cancel")
	public String runProcessCancel(String pdate , String ptno , String ptstatus, String puserid );
	
	@Procedure(procedureName = "JF_PRETERM_PROCESS_PKG.pt_process")
	public String runProcessProcess(String pdate , String ptno , String ptstatus, String puserid );
	
	public Optional<JfTrnBpPtHdrs> findByJtbphNo (String ptno);
	
	public List<JfTrnBpPtHdrs> findByJtbphStatus(String Stat);
	
	public List<JfTrnBpPtHdrs> findByJtbphSofCode(String sof);
	
	
}
