package com.JointFinance.Repository;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.JointFinance.Models.LovJtlGroupCode;
import com.JointFinance.Models.VJfJobType;

@Repository
public interface IVJfJobTypeRepository extends JpaRepository<VJfJobType, String>{
	
	@Procedure(procedureName = "JF_JOB_MANAGERS.P_REPROCESS")
	public String runProses(String p_name, String p_status, String puserid);	
	
	@Procedure(procedureName = "JF_JOB_MANAGERS.P_SENDMAIL")
	public String runSendEmail(String p_name,  String puserid);
	
	@Query(value="UPDATE FS_UTL_JOB_SCHEDULES"
			+ " SET EMAIL_ADDRESS =:pto, "
			+ " EMAIL_SUBJECT=:psubject, "
			+ " EMAIL_NOTE = :pnote"
			+ " WHERE JOB_NAME = :pname", nativeQuery = true)
	public void updateEmail(String pname, String pto, String psubject, String pnote);	
}
