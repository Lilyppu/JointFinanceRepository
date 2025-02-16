package com.JointFinance.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.VJfOthersInfoBuyback;
public interface IVJfOthersInfoBuybackRepository extends JpaRepository<VJfOthersInfoBuyback,String>{

	public Optional<VJfOthersInfoBuyback> findByVjoiBuybackContractNo(String contractno);
}
