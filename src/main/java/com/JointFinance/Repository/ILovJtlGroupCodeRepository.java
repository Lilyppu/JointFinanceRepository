package com.JointFinance.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.LovJtlGroupCode;
import com.JointFinance.Models.TrMstCounterpartiesAndCpBranch;

@Repository
public interface ILovJtlGroupCodeRepository extends JpaRepository <LovJtlGroupCode, String>{
	
	@Query(value="SELECT A.GROUP_CODE, A.ALIASES, A.CP_CODE FROM TREASURY.JF_TRN_GROUPCP_HDRS A "
			+ "WHERE EXISTS (SELECT 1 FROM TREASURY.JF_TRN_LETTERS B WHERE B.LETTER_TYPE = :pLetterType "
			+ "AND B.LETTER_STATUS = 'AC' AND B.GROUP_CODE = A.GROUP_CODE) ORDER BY 1", nativeQuery = true)
	List<LovJtlGroupCode> findJtlGrpCodeByLetterType(String pLetterType);	

}
