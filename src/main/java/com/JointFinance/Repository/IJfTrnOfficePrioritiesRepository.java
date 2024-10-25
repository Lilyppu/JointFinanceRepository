package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnOfficePriorities;
import com.JointFinance.Models.JfTrnOfficePrioritiesCompKey;



public interface IJfTrnOfficePrioritiesRepository extends JpaRepository<JfTrnOfficePriorities,JfTrnOfficePrioritiesCompKey>{
	public Optional<JfTrnOfficePriorities> findByJtopOfficeCodeAndJtopSofCode (String off, String sof);

}
