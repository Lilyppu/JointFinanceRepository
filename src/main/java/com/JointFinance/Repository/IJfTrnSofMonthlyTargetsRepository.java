package com.JointFinance.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnSofMonthlyTargets;
import com.JointFinance.Models.JfTrnSofMonthlyTargetsCompKey;

@Repository
public interface IJfTrnSofMonthlyTargetsRepository extends JpaRepository<JfTrnSofMonthlyTargets, JfTrnSofMonthlyTargetsCompKey> {
	public List<JfTrnSofMonthlyTargets> findBySofCode(String sofCode);
}
