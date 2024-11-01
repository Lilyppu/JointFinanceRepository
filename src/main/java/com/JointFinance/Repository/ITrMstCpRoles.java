package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.TrMstCpRoles;
import com.JointFinance.Models.TrMstCpRolesCompKey;
public interface ITrMstCpRoles extends JpaRepository<TrMstCpRoles, TrMstCpRolesCompKey> {
	
	public Optional<TrMstCpRoles> findByTmcrCpCode(String cpCode);
    public Optional<TrMstCpRoles> findByTmcrBranchId(Integer branchId);
    public Optional<TrMstCpRoles> findByTmcrRoleCode(String roleCode);
 
}