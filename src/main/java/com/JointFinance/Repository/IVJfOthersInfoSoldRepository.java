package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.VJfOthersInfoSold;
public interface IVJfOthersInfoSoldRepository extends JpaRepository<VJfOthersInfoSold,String>{

	public Optional<VJfOthersInfoSold> findByVjoiSoldContractNo(String contractno);
}
