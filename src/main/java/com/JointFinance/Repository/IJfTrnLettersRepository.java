package com.JointFinance.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnLetters;

@Repository
public interface IJfTrnLettersRepository extends JpaRepository<JfTrnLetters, String> {
	
	@Query(value="select * from treasury.jf_trn_letters a where (a.letter_type = :pLetterType"
			+ " or a.sof_code in (select b.sof_code from jf_trn_sof_cps b where b.cp_code = :pCpCode)"
			+ " or a.sof_code = :pSofCode or a.group_code = :pGroupCode) and a.letter_status = 'AC'"
			+ " and a.letter_count > 0 and a.perhit_fif > 0 and exists (select 1 from jf_trn_sof_hdrs c"
			+ " where c.jf_status = 'AC' and c.sof_code = a.sof_code)", nativeQuery = true)
	List<JfTrnLetters> getJtlList(String pLetterType, String pCpCode, String pSofCode, String pGroupCode);
}
