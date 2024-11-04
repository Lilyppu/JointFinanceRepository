package com.JointFinance.Repository;


import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;


import com.JointFinance.Models.LovJtsbCompBankP4B;
import com.JointFinance.Models.LovJtsbCompBankP4BCompkey;

public interface ILovJtsbCompBankP4BRepository extends JpaRepository<LovJtsbCompBankP4B,LovJtsbCompBankP4BCompkey>{

	public List<LovJtsbCompBankP4B> findByLovJtsbCpCodeContaining(String cpcode); ///getLovJtscBankPB(String cpcode);
	
	
}
