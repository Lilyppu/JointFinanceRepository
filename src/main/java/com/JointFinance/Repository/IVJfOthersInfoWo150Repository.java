package com.JointFinance.Repository;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.VJfOthersInfoWo150;
public interface IVJfOthersInfoWo150Repository extends JpaRepository<VJfOthersInfoWo150,String>{

	public Optional<VJfOthersInfoWo150> findByVjoiWo150ContractNo(String contractno);
}
