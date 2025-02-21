package com.JointFinance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.JointFinance.Models.VJfTrnInstallmentTotal;

import jakarta.transaction.Transactional;
public interface IVJfTrnInstallmentsTotalRepository extends JpaRepository<VJfTrnInstallmentTotal,String>{
	
	public Optional<VJfTrnInstallmentTotal> findByVjtitContractNo(String contractno);

}
