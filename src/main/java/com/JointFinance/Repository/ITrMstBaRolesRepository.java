package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.TrMstBaRoles;
import com.JointFinance.Models.TrMstBaRolesCompKey;
public interface ITrMstBaRolesRepository extends JpaRepository<TrMstBaRoles, TrMstBaRolesCompKey>{

	public List<TrMstBaRoles> findByTmbrBankName(String bankname);
    public List<TrMstBaRoles> findByTmbrAccountNo(String accountno);
    public List<TrMstBaRoles> findByTmbrCpCode(String cpnode);
    public List<TrMstBaRoles> findByTmbrBranchId(Integer branchid);
    public List<TrMstBaRoles> findByTmbrRoleCode(String rolecode);
    public Optional<TrMstBaRoles> findByTmbrAccountNoAndTmbrRoleCode(String accountno, String rolecode);
}
