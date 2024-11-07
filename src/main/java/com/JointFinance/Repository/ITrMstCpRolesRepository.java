package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.TrMstCpRoles;
import com.JointFinance.Models.TrMstCpRolesCompKey;
public interface ITrMstCpRolesRepository extends JpaRepository<TrMstCpRoles, TrMstCpRolesCompKey> {
	
	public List<TrMstCpRoles> findByTmcrCpCode(String cpcode);
    public List<TrMstCpRoles> findByTmcrBranchId(Integer branchid);
    public List<TrMstCpRoles> findByTmcrRoleCode(String rolecode);
 
}