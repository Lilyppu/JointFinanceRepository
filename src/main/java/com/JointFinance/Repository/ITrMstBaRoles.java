package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.TrMstBaRoles;
import com.JointFinance.Models.TrMstBaRolesCompKey;
public interface ITrMstBaRoles extends JpaRepository<TrMstBaRoles, TrMstBaRolesCompKey>{

	public Optional<TrMstBaRoles> findByTmbrBankName(String bankName);
    public Optional<TrMstBaRoles> findByTmbrAccountNo(String accountNo);
    public Optional<TrMstBaRoles> findByTmbrCpCode(String cpCode);
    public Optional<TrMstBaRoles> findByTmbrBranchId(Integer branchID);
    public Optional<TrMstBaRoles> findByTmbrRoleCode(String roleCode);
}
