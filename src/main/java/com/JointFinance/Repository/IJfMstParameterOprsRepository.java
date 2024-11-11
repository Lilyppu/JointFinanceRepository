package com.JointFinance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JointFinance.Models.JfMstParameterOprs;
import com.JointFinance.Models.JfMstParameterOprsCompKey;

public interface IJfMstParameterOprsRepository extends JpaRepository<JfMstParameterOprs, JfMstParameterOprsCompKey>{
	
	public List<JfMstParameterOprs> findByJmpoParamCode (String code);
	
	public Optional<JfMstParameterOprs> findByJmpoParamCodeAndJmpoOprSign (String code, String opr);

}
