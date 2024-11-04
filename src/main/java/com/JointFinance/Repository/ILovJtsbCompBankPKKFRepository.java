package com.JointFinance.Repository;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.LovJtsbCompBankP4B;
import com.JointFinance.Models.LovJtsbCompBankPKKF;
import com.JointFinance.Models.LovJtsbCompBankPKKFCompkey;

public interface ILovJtsbCompBankPKKFRepository extends JpaRepository<LovJtsbCompBankPKKF,LovJtsbCompBankPKKFCompkey> {
	
	public List<LovJtsbCompBankPKKF> findByLovJtsbBankPkkfCpCodeContaining(String cpcode);

}
