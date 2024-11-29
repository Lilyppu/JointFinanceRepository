package com.JointFinance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnSofSummaries;
import com.JointFinance.Models.JfTrnSofSummariesCompKey;

@Repository
public interface IJfTrnSofSummariesRepository extends JpaRepository<JfTrnSofSummaries, JfTrnSofSummariesCompKey> {

}
