package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnSofSoftcopies;
import com.JointFinance.Models.JfTrnSofSoftcopiesCompKey;

import jakarta.transaction.Transactional;
public interface IJfTrnSofSoftcopiesRepository extends JpaRepository<JfTrnSofSoftcopies,JfTrnSofSoftcopiesCompKey>{
	
	public List<JfTrnSofSoftcopies> findByJtssSofCode (String sofcode);
	public Optional<JfTrnSofSoftcopies> findByJtssSofCodeAndJtssSoftcopySeqNo(String sofcode, Integer softcopyseqno);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM JF_TRN_SOF_SOFTCOPIES a WHERE a.SOF_CODE = ?1 AND a.SOFTCOPY_SEQ_NO = ?2",nativeQuery = true)
    int getDelJtss(String sofcode, Integer softcopyseqno);
	
	/*
	@Query(value="SELECT A.SOF_CODE, A.SEQ_NO, A.SOFTCOPY_SEQ_NO, A.SOFTCOPY_TYPE, A.SOFTCOPY_CODE, A.STATUS_FLAG, A.LETTER_TYPE, A.CREATED_BY, A.CREATED_TIMESTAMP, A.LASTUPDATE_BY, A.LASTUPDATE_TIMESTAMP, B.DESCRIPTION\r\n"
			+ "FROM JF_TRN_SOF_SOFTCOPIES A, JF_MST_SOFTCOPIES B\r\n"
			+ "WHERE A.SOFTCOPY_CODE = B.SOFTCOPY_CODE", nativeQuery = true )
	List<Object[]> getJtssAllWithDescriptionRaw();
	*/
	
	/*
	List<JfTrnSofSoftcopies> getJtssAll();
	@Transactional
	@Modifying
	@Query(value = "SELECT DESCRIPTION"
			+ "FROM JF_MST_SOFTCOPIES"
			+ "WHERE SOFTCOPY_CODE = ?1",nativeQuery = true)
    int getDescriptionJtss(String softcopycode);
	*/
	
	@Procedure(procedureName = "GET_DESCRIPTION_JTSS")
	public String getDescriptionJtss(String softcopycode);	
	
}
