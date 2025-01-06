package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnSofSoftcopies;
import com.JointFinance.Repository.IJfTrnSofSoftcopiesRepository;
@Service
public class ServiceJfTrnSofSoftcopies {
	@Autowired
	IJfTrnSofSoftcopiesRepository repoJTSS;
	
	public List<JfTrnSofSoftcopies> getJtssAll(){
		return repoJTSS.getJtssAll();
	}
	
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