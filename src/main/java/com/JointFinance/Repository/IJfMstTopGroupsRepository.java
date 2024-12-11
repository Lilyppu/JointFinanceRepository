package com.JointFinance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfMstTopGroups;

import jakarta.transaction.Transactional;

public interface IJfMstTopGroupsRepository extends JpaRepository<JfMstTopGroups, Integer> {

	public Optional<JfMstTopGroups> findByJmtgTopId (Integer topid);

	public List<JfMstTopGroups> findAllByJmtgTopId(Integer topid);

	@Transactional
	@Modifying
	@Query(value = "DELETE FROM JF_MST_TOP_GROUPS a WHERE a.TOP_ID = ?1",nativeQuery = true)
    int getDelJmtgById(Integer topid);
	
}
