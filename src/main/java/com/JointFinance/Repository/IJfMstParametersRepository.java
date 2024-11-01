package com.JointFinance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JointFinance.Models.JfMstParameters;


public interface IJfMstParametersRepository extends JpaRepository<JfMstParameters, String> {
	
	public List<JfMstParameters> findByJmpParamCodeContaining (String code);
	
	public List<JfMstParameters> findByJmpParamNameContaining (String pname);
	
	public List<JfMstParameters> findByJmpDescriptionContaining (String desc);
	
	public Optional<JfMstParameters> findByJmpParamCode (String code);
	

}
