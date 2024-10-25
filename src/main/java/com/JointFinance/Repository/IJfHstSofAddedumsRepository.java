package com.JointFinance.Repository;


import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfHstSofAddedums;
import com.JointFinance.Models.JfHstSofAddedumsCompKey;



public interface IJfHstSofAddedumsRepository extends JpaRepository<JfHstSofAddedums,JfHstSofAddedumsCompKey>{
	public Optional<JfHstSofAddedums> findByJhsaSofCodeAndJhsaSeqnoAndJhsaVersion (String code, Integer seq, Integer ver);
}
