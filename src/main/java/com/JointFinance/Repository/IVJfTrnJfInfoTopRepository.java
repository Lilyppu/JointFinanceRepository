package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.VJfTrnJfinfoTop;
public interface IVJfTrnJfInfoTopRepository extends JpaRepository<VJfTrnJfinfoTop,String>{
	
	//public List<LovJtclContract> findByVjtclSofCodeContaining(String sofcode);
	//public List<LovJtclContract> findByVjtclContractNoContaining(String contractno);
	public Optional<VJfTrnJfinfoTop> findByVjtjtContractNo(String contractno);
	
}
