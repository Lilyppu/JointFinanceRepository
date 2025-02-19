package com.JointFinance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.JointFinance.Models.JfTrnInstallments;
import com.JointFinance.Models.JfTrnInstallmentsCompKey;

import jakarta.transaction.Transactional;
public interface IJfTrnInstallmentsRepository extends JpaRepository<JfTrnInstallments,JfTrnInstallmentsCompKey>{
	
	public List<JfTrnInstallments> findByJtisSofCodeAndJtisContractNoOrderByJtisInstNoAsc(String sofcode, String contractno);
	
	public List<JfTrnInstallments> findByJtisContractNoOrderByJtisInstNoAsc(String contractno);
}
