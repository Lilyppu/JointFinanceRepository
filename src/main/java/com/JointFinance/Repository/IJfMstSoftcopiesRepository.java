package com.JointFinance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.JointFinance.Models.JfMstSoftcopies;

import jakarta.transaction.Transactional;

public interface IJfMstSoftcopiesRepository extends JpaRepository<JfMstSoftcopies,String>{

	public Optional<JfMstSoftcopies> findByJmscSoftcopyCode(String softcopycode);
	public List<JfMstSoftcopies> findByJmscSoftcopyCodeContaining(String softcopycode);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM JF_MST_SOFTCOPIES a WHERE a.SOFTCOPY_CODE = ?1",nativeQuery = true)
    int getDelBySoftcopyCode(String softcopycode);
}
