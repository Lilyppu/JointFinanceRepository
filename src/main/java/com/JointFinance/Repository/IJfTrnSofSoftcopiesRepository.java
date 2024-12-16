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
}
