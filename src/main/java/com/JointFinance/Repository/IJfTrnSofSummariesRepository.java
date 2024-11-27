package com.JointFinance.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
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
	public List<JfTrnSofSummaries> getListJfTrnSofSummariesBySofDate(Date sofDate, Date sofDate1);
	
	public List<JfTrnSofSummaries> getListJfTrnSofSummariesBySofDateStatus(Date jtssSofDate, String jtssApproveStatus);
	
	@Procedure(procedureName = "P_GENJF")
	public String procGenJF(String p_userid, Date p_simdate);
	
	@Procedure(procedureName = "P_SIMJF")
	public String procSimJF(String p_userid, Date p_simdate);
}
