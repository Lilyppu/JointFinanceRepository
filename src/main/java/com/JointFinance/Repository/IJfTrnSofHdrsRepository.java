package com.JointFinance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnLetters;
import com.JointFinance.Models.JfTrnSofHdrs;

public interface IJfTrnSofHdrsRepository extends JpaRepository<JfTrnSofHdrs, String> {
      
	public Optional<JfTrnSofHdrs> findByJtshSofCode (String code);
	
	public List<JfTrnSofHdrs> findByJtshSofCodeContaining (String code);
	
	public List<JfTrnSofHdrs> findByJtshAliasContaining (String alias);
	
	public List<JfTrnSofHdrs> findByJtshJfStatusContaining (String status);
	
	public List<JfTrnSofHdrs> findByJtshPlatformContaining (String platform);
	
	
	
	@Query(value="SELECT  aa.SOF_CODE, aa.DESCRIPTION, aa.ALIASES, aa.START_DATE, aa.END_DATE,"
			+ " aa.AGREEMENT_NO, aa.AGREEMENT_DATE, aa.CONTACT_PERSON, aa.PERSON_GENDER,"
			+ " aa.CREDITUR_TYPE, aa.CREDITUR_NAME, aa.CREDITUR_ADDR, aa.CREDITUR_CITY,"
			+ " aa.JF_TYPE, aa.JF_MODEL, JF_STATUS, aa.NUMBER_CP, aa.SYARIAH_DEFAULT, aa.COY_ID,"
			+ " aa.PRIORITY, aa.COY_PORTION, aa.TARGET_AMT, aa.USED_AMT, aa.PAID_AMT, aa.IS_REVOLVING,"
			+ " aa.PLATFORM, aa.PROCESS_GROUP, aa.IGNORE_PLAFOND, "
			+ " aa.CREATED_BY, aa.CREATED_TIMESTAMP, aa.LASTUPDATE_BY, aa.LASTUPDATE_TIMESTAMP "
			+ " FROM jf_trn_sof_hdrs aa, TREASURY.JF_TRN_SOF_CPS t3"
			+ " where aa.sof_code=t3.sof_code"
			+ " and t3.cp_code=:cpcode"
			+ " ORDER BY 1", nativeQuery = true)
	public List<JfTrnSofHdrs> getLovSoft(String cpcode);
	
	
}
