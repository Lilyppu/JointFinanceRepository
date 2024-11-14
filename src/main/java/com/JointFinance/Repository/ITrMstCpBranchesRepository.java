package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfMstParameterOprs;
import com.JointFinance.Models.TrMstCpBranches;
import com.JointFinance.Models.TrMstCpBranchesCompKey;
public interface ITrMstCpBranchesRepository extends JpaRepository<TrMstCpBranches, TrMstCpBranchesCompKey>{

	public Optional<TrMstCpBranches> findByTmcbrCpCode(String cpCode);
    public Optional<TrMstCpBranches> findByTmcbrBranchId(Integer branchId);
    public Optional<TrMstCpBranches> findByTmcbrCpCodeAndTmcbrBranchId (String cpcode, Integer branchid);
}
