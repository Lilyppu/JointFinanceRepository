package com.JointFinance.Repository;

import java.util.Date;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.TrMstCpBas;
import com.JointFinance.Models.TrMstCpBasCompKey;

import jakarta.transaction.Transactional;
public interface ITrMstCpBasRepository extends JpaRepository<TrMstCpBas, TrMstCpBasCompKey>{

	public List<TrMstCpBas> findByTmcbBankName(String bankName);
	
    public Optional<TrMstCpBas> findByTmcbAccountNo(String accountNo);
    
    @Query(value = "SELECT *"
			+ "  FROM TR_MST_CP_BAS"
			+ " WHERE NVL(STATUS_FLAG, 'N')='N'", nativeQuery = true)
    public List<TrMstCpBas> getListTmcbSfN();
    
    @Transactional
	@Modifying
    @Query(value = "UPDATE TR_MST_CP_BAS t SET t.STATUS_FLAG = ?2 WHERE t.ACCOUNT_NO = ?1",nativeQuery = true)
    int approveCpBas(String accountno, String statusFlag);
    
}