package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnSofIntrDtls;
import com.JointFinance.Models.JfTrnSofIntrDtlsCompKey;

public interface IJfTrnSofIntrDtlsRepository extends JpaRepository<JfTrnSofIntrDtls, JfTrnSofIntrDtlsCompKey> {
	
	public List<JfTrnSofIntrDtls> findByJtsidSofCodeAndJtsidSeqnoAndJtsidIntrNo (String sof, Integer seq, Integer no);

}
