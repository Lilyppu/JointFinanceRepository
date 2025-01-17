package com.JointFinance.Repository;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.LovJtclContract;
import com.JointFinance.Models.LovJtclContractCompkey;
public interface ILovJtclContractRepository extends JpaRepository<LovJtclContract,LovJtclContractCompkey>{

	public List<LovJtclContract> findByVjtclSofCodeContaining(String sofcode);
	public List<LovJtclContract> findByVjtclContractNoContaining(String contractno);
}
