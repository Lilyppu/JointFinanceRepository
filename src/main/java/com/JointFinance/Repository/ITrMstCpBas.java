package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.TrMstCpBas;
import com.JointFinance.Models.TrMstCpBasCompKey;
public interface ITrMstCpBas extends JpaRepository<TrMstCpBas, TrMstCpBasCompKey>{

	public List<TrMstCpBas> findByTmcbBankName(String bankName);
	
    public Optional<TrMstCpBas> findByTmcbAccountNo(String accountNo);
}
