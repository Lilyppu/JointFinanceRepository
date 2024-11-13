package com.JointFinance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.JointFinance.Models.JfMstParameterOprs;
import com.JointFinance.Models.JfMstParameterOprsCompKey;

import jakarta.transaction.Transactional;

public interface IJfMstParameterOprsRepository extends JpaRepository<JfMstParameterOprs, JfMstParameterOprsCompKey>{
	
	public List<JfMstParameterOprs> findByJmpoParamCode (String code);
	
	public Optional<JfMstParameterOprs> findByJmpoParamCodeAndJmpoOprSign (String code, String opr);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM JF_MST_PARAMETER_OPRS s WHERE s.PARAM_CODE = ?1 AND s.OPR_SIGN = ?2",nativeQuery = true)
    int getDelJmpoOprs(String code, String oprs);

}
