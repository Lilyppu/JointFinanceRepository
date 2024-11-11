package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnSofParameters;
import com.JointFinance.Models.JfTrnSofParametersCompKey;



public interface IJfTrnSofParametersRepository extends JpaRepository<JfTrnSofParameters, JfTrnSofParametersCompKey> {

	public Optional<JfTrnSofParameters> findByJtspSofCodeAndJtspVerAndJtspSeqNo (String sof, Integer ver, Integer seq);
	
	public List<JfTrnSofParameters> findByJtspSofCode (String sof);
}
