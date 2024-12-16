package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfMstTopGroupDtls;
import com.JointFinance.Models.JfMstTopGroupDtlsCompKey;

import jakarta.transaction.Transactional;
@Repository
public interface IJfMstTopGroupDtlsRepository extends JpaRepository<JfMstTopGroupDtls,JfMstTopGroupDtlsCompKey>{

	public List<JfMstTopGroupDtls> findByJmtgdTopId (Integer topid);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM JF_MST_TOP_GROUP_DTLS a WHERE a.TOP_ID = ?1 AND a.SOF_CODE = ?2",nativeQuery = true)
    int getDelByJmtgdTopId(Integer topid, String sofcode);
	
	@Procedure(procedureName = "TREASURY.TREASURY_P_INSALLSOFCODE")
	public String insAllSofCode(Integer topid);	
	
}
