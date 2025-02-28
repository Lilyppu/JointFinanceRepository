package com.JointFinance.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.JfTrnSofSummaries;
import com.JointFinance.Models.JfTrnSofSummariesCompKey;

@Repository
public interface IJfTrnSofSummariesRepository extends JpaRepository<JfTrnSofSummaries, JfTrnSofSummariesCompKey> {
	
	@Query(value = "SELECT jtss.*\r\n"
				+ "  FROM JF_TRN_SOF_SUMMARIES jtss\r\n"
				+ " WHERE TRUNC (jtss.SOF_DATE) <= ?1\r\n"
				+ "       AND jtss.APPROVE_STATUS = 'NA'\r\n"
				+ "       AND PRNC_AMT > 0\r\n"
				+ "       AND (EXISTS (SELECT 1 FROM JF_TRN_SOF_HDRS jtsh WHERE jtsh.JF_MODEL = 'JF'\r\n"
				+ "                    AND jtsh.SOF_CODE = jtss.SOF_CODE) OR jtss.SOF_CODE = '000')\r\n"
				+ "       AND NOT EXISTS (SELECT 1 FROM JF_TRN_SOF_SUMMARIES jtss2\r\n"
				+ "                        WHERE APPROVE_STATUS = 'AP'\r\n"
				+ "                          AND jtss2.SOF_CODE = jtss.SOF_CODE\r\n"
				+ "                          AND TRUNC (SOF_DATE) = ?2)", nativeQuery = true)
	public List<JfTrnSofSummaries> findBySofDate(Date sofDate, Date sofDate1);
	
	public List<JfTrnSofSummaries> findByJtssSofDateAndJtssApproveStatus(Date sofDate, String approveStatus);
	
	@Procedure(procedureName = "P_GENJF")
	public String procGenJF(String p_userid, Date p_simdate);
	
	@Procedure(procedureName = "P_SIMJF")
	public String procSimJF(String p_userid, Date p_simdate);
	
	@Procedure(procedureName = "P_APP_JF")
	public String procAprvJF(String p_userid, String jtssSofCode);
	
	@Query(value = "SELECT JF_F_TOT_FIFPCT (:P_SOF_CODE, :P_SOF_DATE, :P_TOP_ID) FROM DUAL", nativeQuery = true)
	public BigDecimal getTotFifPct(@Param("P_SOF_CODE") String sofCode, @Param("P_SOF_DATE") Date sofDate, @Param("P_TOP_ID") Integer topId);
	
	@Query(value = "SELECT JF_F_TOT_JF_PORTION (:P_SIM_DATE) FROM DUAL", nativeQuery = true)
	public BigDecimal getTotJfPortion(@Param("P_SIM_DATE") Date simDate);
	
	@Procedure(procedureName = "JF_P_SIMJF")
	public String procSimJF(String p_sof_code, Integer p_top_id, Date p_simdate, BigDecimal p_adjusment_amt, String p_sof_code_target, String p_userid);
}
