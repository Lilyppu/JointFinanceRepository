package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnSofDisbursements;
import com.JointFinance.Models.JfTrnSofDisbursementsCompKey;
import com.JointFinance.Models.JfTrnSofSoftcopies;

import jakarta.transaction.Transactional;
public interface IJfTrnSofDisbursementsRepository extends JpaRepository<JfTrnSofDisbursements,JfTrnSofDisbursementsCompKey>{

	public List<JfTrnSofDisbursements> findByJtsdsSofCode (String sofcode);
	public Optional<JfTrnSofDisbursements> findByJtsdsSofCodeAndJtsdsSeqNo(String sofcode, Integer seqno);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM JF_TRN_SOF_DISBURSEMENTS a WHERE a.SOF_CODE = ?1 AND a.SEQ_NO = ?2",nativeQuery = true)
    int getDelJtsds(String sofcode, Integer seqno);
	
	@Query(value = "CALL P_GET_SOF_DESC(:sofCode, :description)", nativeQuery = true)
    void callGetSofDescription(String sofCode, String description);
	
	/*
	@Procedure(procedureName = "P_GET_SOF_DESC")
	public String getSofDesc(String sofcode,  String sofcodedesc);
	*/
	
	/*
	@Query(value="SELECT B.SOF_CODE, B.SEQ_NO, B.DATE_DISB, B.FIRST_DUEDATE, B.CREATED_BY, B.CREATED_TIMESTAMP, B.LASTUPDATE_BY, B.LASTUPDATE_TIMESTAMP, A.DESCRIPTION\r\n"
			+ "FROM JF_TRN_SOF_HDRS A, JF_TRN_SOF_DISBURSEMENTS B\r\n"
			+ "WHERE A.SOF_CODE = B.SOF_CODE", nativeQuery = true )
	List<Object[]> getJtsdsAllWithDescriptionRaw();
	*/
}
