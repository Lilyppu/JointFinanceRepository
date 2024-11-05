package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnSofAddedums;
import com.JointFinance.Models.JfTrnSofAddedumsCompKey;

public interface IJfTrnSofAddedumsRepository extends JpaRepository<JfTrnSofAddedums,JfTrnSofAddedumsCompKey>{
	
	public Optional<JfTrnSofAddedums> findByJtsaSofCodeAndJtsaSeqno (String code, Integer seq);
	
	public Optional<JfTrnSofAddedums> findByJtsaSofCode (String code);

}
