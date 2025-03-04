package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnSofParamDtls;
import com.JointFinance.Models.JfTrnSofParamDtlsCompKey;


public interface IJfTrnSofParamDtlsRepository extends JpaRepository<JfTrnSofParamDtls,JfTrnSofParamDtlsCompKey> {
	
	public List<JfTrnSofParamDtls> findByJtspdSofCodeAndJtspdVerAndJtspdSeqNo (String sof, Integer ver, Integer seq);
	
	public Optional<JfTrnSofParamDtls> findByJtspdSofCodeAndJtspdVerAndJtspdSeqNoAndJtspdOfficeCode (String sof, Integer ver, Integer seq, String off);

}
