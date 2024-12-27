package com.JointFinance.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnSofDailyTargets;
import com.JointFinance.Models.JfTrnSofDailyTargetsCompKey;

@Repository
public interface IJfTrnSofDailyTargetsRepository extends JpaRepository<JfTrnSofDailyTargets, JfTrnSofDailyTargetsCompKey> {
	public List<JfTrnSofDailyTargets> findByJtsdtSofCode(String jtsdtSofCode);
}
