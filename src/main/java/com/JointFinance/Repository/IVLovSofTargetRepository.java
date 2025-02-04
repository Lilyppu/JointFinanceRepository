package com.JointFinance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.VLovSofTarget;

@Repository
public interface IVLovSofTargetRepository extends JpaRepository<VLovSofTarget, String> {

}
