package com.JointFinance.Services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnSofDisbursements;
import com.JointFinance.Models.JfTrnSofSoftcopies;
import com.JointFinance.Repository.IJfTrnSofDisbursementsRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
@Service
public class ServiceJfTrnSofDisbursements {
	@Autowired
	IJfTrnSofDisbursementsRepository repoJTSDS;
	
	public List<JfTrnSofDisbursements> getJtsdsAll(){
		return repoJTSDS.findAll();
	}
	/*
	public List<JfTrnSofDisbursements> getJtsdsAllCstm(){
		return repoJTSDS.getJtsdsAllCstm();
	}
	*/
	
	/*
	public List<JfTrnSofDisbursements> getAllWithDescription() {
        List<Object[]> rawResults = repoJTSDS.getJtsdsAllWithDescriptionRaw();
        List<JfTrnSofDisbursements> resultList = new ArrayList<>();

        // Map the raw results to the entity
        for (Object[] row : rawResults) {
        	JfTrnSofDisbursements entity = new JfTrnSofDisbursements();
            entity.setJtsdsSofCode((String) row[0]);
            entity.setJtsdsSeqNo(((BigDecimal) row[1]).intValue()); // Convert BigDecimal to Integer
            entity.setJtsdsDateDisb(((BigDecimal) row[2]).intValue()); // Convert BigDecimal to Integer
            entity.setJtsdsFirstDuedate(((BigDecimal) row[3]).intValue());
            entity.setJtsdsCreatedBy((String) row[4]);
            entity.setJtsdsCreatedTimestamp((Date) row[5]);
            entity.setJtsdsLastupdateBy((String) row[6]);
            entity.setJtsdsLastupdateTimestamp((Date) row[7]);
            entity.setJtsdsSofCodeDesc((String) row[8]); // Set the description from B.DESCRIPTION
            resultList.add(entity);
        }
        
        return resultList;
    }
	*/
	public List<JfTrnSofDisbursements> getByJtsdsSofCodeList(String sofcode){
		return repoJTSDS.findByJtsdsSofCode(sofcode);
	}
	
	public Optional<JfTrnSofDisbursements> getJtsdsSofCodeAndSeqNoCU(String sofcode, Integer softcopyseqno){
		return repoJTSDS.findByJtsdsSofCodeAndJtsdsSeqNo(sofcode,softcopyseqno);
	}
	
	public String saveUpdateJfTrnSofDisbursements(JfTrnSofDisbursements jtsds) {
		repoJTSDS.save(jtsds);
		return "Submit Successfully";
	}
	
	public String getDelJtsds(String sofcode,Integer seqno) {
		repoJTSDS.getDelJtsds(sofcode,seqno);
		return "Delete Successfully";
	}
	
	/*
	public String getSofDesc(String sofcode,String sofcodedesc) {
		return repoJTSDS.getSofDesc(sofcode,sofcodedesc);
	}
	*/
	
	/*
	public String getSofDescription(String sofCode) {
        String description = null;
        // Call the repository method to execute the stored procedure
        repoJTSDS.callGetSofDescription(sofCode, description);
        return description; // Handle the output as needed
    }
	*/
	
	/*
	public String getSofDescription(String sofCode) {
        String description = null;

        // Create a StoredProcedureQuery
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("Get_SOF_Description");
        query.registerStoredProcedureParameter("p_sof_code", String.class, jakarta.persistence.ParameterMode.IN);
        query.registerStoredProcedureParameter("p_description", String.class, jakarta.persistence.ParameterMode.OUT);

        // Set the input parameter
        query.setParameter("p_sof_code", sofCode);

        // Execute the stored procedure
        query.execute();

        // Retrieve the output parameter
        description = (String) query.getOutputParameterValue("p_description");

        return description;
    }
	*/
}
