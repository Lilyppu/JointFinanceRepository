package com.JointFinance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnSofHdrs;

public interface IJfTrnSofHdrsRepository extends JpaRepository<JfTrnSofHdrs, String> {
      
	public Optional<JfTrnSofHdrs> findByJtshSofCode (String code);
	
	public List<JfTrnSofHdrs> findByJtshSofCodeContaining (String code);
	
	public List<JfTrnSofHdrs> findByJtshAliasContaining (String alias);
	
	public List<JfTrnSofHdrs> findByJtshJfStatusContaining (String status);
	
	public List<JfTrnSofHdrs> findByJtshPlatformContaining (String platform);
}
