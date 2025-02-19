package com.JointFinance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.JointFinance.Models.JfTrnInstallmentDtls;
import com.JointFinance.Models.JfTrnInstallmentDtlsCompKey;

import jakarta.transaction.Transactional;
public interface IJfTrnInstallmentDtlsRepository extends JpaRepository<JfTrnInstallmentDtls,JfTrnInstallmentDtlsCompKey>{

	public List<JfTrnInstallmentDtls> findByJtidSofCodeAndJtidContractNoOrderByJtidInstNoAsc(String sofcode, String contractno);
	
	public List<JfTrnInstallmentDtls> findByJtidContractNoOrderByJtidInstNoAsc(String contractno);
}
