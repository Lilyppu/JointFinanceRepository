package com.JointFinance.Repository;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnLetters;
import com.JointFinance.Models.VJfPretermInfo;

@Repository
public interface IVJfPretermInfoRepository extends JpaRepository<VJfPretermInfo,String> {
	public Optional<VJfPretermInfo> findByVjptiNoAndVjptiSofNo (String ptno, String sof);
}
