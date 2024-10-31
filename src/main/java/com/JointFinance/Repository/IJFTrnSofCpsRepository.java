package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JFTrnSofCps;
import com.JointFinance.Models.JFTrnSofCpsCompKey;
public interface IJFTrnSofCpsRepository extends JpaRepository<JFTrnSofCps, JFTrnSofCpsCompKey> {
	
	public Optional<JFTrnSofCps> findByJtscSofCodeAndJtscSeqno (String code, Integer seq);
	
	public List<JFTrnSofCps> findByJtscSofCode (String code);
	

}
