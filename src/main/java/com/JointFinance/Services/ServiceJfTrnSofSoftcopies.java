package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;
import java.util.Date; // Ensure this is java.util.Date

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.JointFinance.Models.JfTrnSofSoftcopies;
import com.JointFinance.Repository.IJfTrnSofSoftcopiesRepository;
@Service
public class ServiceJfTrnSofSoftcopies {
	@Autowired
	IJfTrnSofSoftcopiesRepository repoJTSS;
	
	public List<JfTrnSofSoftcopies> getJtssAll(){
		//return repoJTSS.getJtssAll();
		return repoJTSS.findAll();
	}
	
	/*
	public List<JfTrnSofSoftcopies> getAllWithDescription() {
        List<Object[]> rawResults = repoJTSS.getJtssAllWithDescriptionRaw();
        List<JfTrnSofSoftcopies> resultList = new ArrayList<>();
        
        for (Object[] row : rawResults) {
            JfTrnSofSoftcopies entity = new JfTrnSofSoftcopies();
            entity.setJtssSofCode((String) row[0]);
            entity.setJtssSeqNo((Integer) row[1]);
            entity.setJtssSoftcopySeqNo((Integer) row[2]);
            entity.setJtssSoftcopyType((String) row[3]);
            entity.setJtssSoftcopyCode((String) row[4]);
            entity.setJtssStatusFlag((String) row[5]);
            entity.setJtssLetterType((String) row[6]);
            entity.setJtssCreatedBy((String) row[7]);
            entity.setJtssCreatedTimestamp((Date) row[8]);
            entity.setJtssLastupdateBy((String) row[9]);
            entity.setJtssLastupdateTimestamp((Date) row[10]);
            entity.setJtssSofCodeDesc((String) row[11]); // Set the description
            resultList.add(entity);
        }
        return resultList;
    }
	*/
	
	/*
	// Method to get all soft copies with descriptions
    public List<JfTrnSofSoftcopies> getAllWithDescription() {
        List<Object[]> rawResults = repoJTSS.getJtssAllWithDescriptionRaw();
        List<JfTrnSofSoftcopies> resultList = new ArrayList<>();

        // Map the raw results to the entity
        for (Object[] row : rawResults) {
            JfTrnSofSoftcopies entity = new JfTrnSofSoftcopies();
            entity.setJtssSofCode((String) row[0]);
            entity.setJtssSeqNo(((BigDecimal) row[1]).intValue()); // Convert BigDecimal to Integer
            entity.setJtssSoftcopySeqNo(((BigDecimal) row[2]).intValue()); // Convert BigDecimal to Integer
            entity.setJtssSoftcopyType((String) row[3]);
            entity.setJtssSoftcopyCode((String) row[4]);
            entity.setJtssStatusFlag((String) row[5]);
            entity.setJtssLetterType((String) row[6]);
            entity.setJtssCreatedBy((String) row[7]);
            entity.setJtssCreatedTimestamp((Date) row[8]);
            entity.setJtssLastupdateBy((String) row[9]);
            entity.setJtssLastupdateTimestamp((Date) row[10]);
            entity.setJtssSofCodeDesc((String) row[11]); // Set the description from B.DESCRIPTION
            resultList.add(entity);
        }
        
        return resultList;
    }
	*/
	
	public List<JfTrnSofSoftcopies> getByJtssSofCodeList(String sofcode){
		return repoJTSS.findByJtssSofCode(sofcode);
	}
	
	public Optional<JfTrnSofSoftcopies> getJtssSofCodeAndSoftcopySeqNoCU(String sofcode, Integer softcopyseqno){
		return repoJTSS.findByJtssSofCodeAndJtssSoftcopySeqNo(sofcode,softcopyseqno);
	}
	
	public String saveUpdateJfTrnSofSoftcopies(JfTrnSofSoftcopies jtss) {
		repoJTSS.save(jtss);
		return "Submit Successfully";
	}
	
	public String getDelJtss(String sofcode,Integer softcopyseqno) {
		repoJTSS.getDelJtss(sofcode,softcopyseqno);
		return "Delete Successfully";
	}
	
	public String getDescriptionJtss(String softcopycode) {
		return repoJTSS.getDescriptionJtss(softcopycode);
	}
}