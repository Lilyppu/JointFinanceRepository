package com.JointFinance.Repository;


import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnSofBas;
import com.JointFinance.Models.JfTrnSofBasCompKey;
import com.JointFinance.Models.JfTrnSofParamDtls;
import com.JointFinance.Models.JfTrnSofParamDtlsCompKey;

public interface IJfTrnSofBasrepository extends JpaRepository<JfTrnSofBas, JfTrnSofBasCompKey>{
	
	public Optional<JfTrnSofBas> findByJtsbSofCodeAndJtsbSeqNoAndJtsbAcctNo (String sof, Integer seq, String acc);
	
	public List<JfTrnSofBas> findByJtsbSofCodeAndJtsbSeqNo (String sof, Integer seq);
	

	

}
