package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.TrMstCounterpartiesAndCpBranch;
import com.JointFinance.Models.TrMstCounterpartiesAndCpBranchCompKey;
@Repository
public interface ITrMstCounterpartiesAndCpBranchRepository extends JpaRepository<TrMstCounterpartiesAndCpBranch, TrMstCounterpartiesAndCpBranchCompKey> {

	@Query(value="select a.cp_code,a.cp_type,a.name_short, b.branch_id, b.branch_name, c.account_no "
			  + "from tr_mst_counterparties a, tr_mst_cp_branches b, tr_mst_cp_bas c where a.cp_code = b.cp_code "
			  + "and a.cp_code = c.cp_code and b.branch_id = c.branch_id and B.status_flag = 'A' "
			  + "order by a.cp_code", nativeQuery = true)
	List<TrMstCounterpartiesAndCpBranch> findTmcacbList();
	
	@Query(value="select a.cp_code,a.cp_type,a.name_short, b.branch_id, b.branch_name, c.account_no "
			  + "from tr_mst_counterparties a, tr_mst_cp_branches b, tr_mst_cp_bas c where a.cp_code = b.cp_code "
			  + "and a.cp_code = c.cp_code and b.branch_id = c.branch_id and b.status_flag = 'A' and a.cp_code LIKE :pCp "
			  + "order by a.cp_code", nativeQuery = true)
	List<TrMstCounterpartiesAndCpBranch> findTmcacbByCpCode(String pCp);

	@Query(value="select a.cp_code,a.cp_type,a.name_short, b.branch_id, b.branch_name, c.account_no "
			  + "from tr_mst_counterparties a, tr_mst_cp_branches b, tr_mst_cp_bas c where a.cp_code = b.cp_code "
			  + "and a.cp_code = c.cp_code and b.branch_id = c.branch_id and B.status_flag = 'A' and a.cp_code = :pCp and b.branch_id = :pBi ", nativeQuery = true)
	Optional<TrMstCounterpartiesAndCpBranch> findTmcacbByCpCodeAndBranchId(String pCp, Integer pBi);
}
