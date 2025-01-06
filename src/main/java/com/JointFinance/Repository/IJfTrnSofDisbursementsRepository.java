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

import jakarta.transaction.Transactional;
public interface IJfTrnSofDisbursementsRepository extends JpaRepository<JfTrnSofDisbursements,JfTrnSofDisbursementsCompKey>{

	public List<JfTrnSofDisbursements> findByJtsdsSofCode (String sofcode);
	public Optional<JfTrnSofDisbursements> findByJtsdsSofCodeAndJtsdsSeqNo(String sofcode, Integer seqno);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM JF_TRN_SOF_DISBURSEMENTS a WHERE a.SOF_CODE = ?1 AND a.SEQ_NO = ?2",nativeQuery = true)
    int getDelJtsds(String sofcode, Integer seqno);
}
