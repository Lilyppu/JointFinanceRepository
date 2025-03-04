package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.TrMstCpersons;

public interface ITrMstCpersonsRepository extends JpaRepository<TrMstCpersons, String> {

	public Optional<TrMstCpersons> findByTmcpCpCode(String cpcode);
	
	public List<TrMstCpersons> findByTmcpBranchId(Integer branchid);
	
	public List<TrMstCpersons> findByTmcpCpCodeAndTmcpBranchId(String cpcode, Integer branchid);
}
