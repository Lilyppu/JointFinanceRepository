package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfMstSoftcopies;
import com.JointFinance.Repository.IJfMstSoftcopiesRepository;

@Service
public class ServiceJfMstSoftcopies {
	@Autowired
	IJfMstSoftcopiesRepository repoJMSC;
	
	public List<JfMstSoftcopies> getJmscAll(){
		return repoJMSC.findAll();
	}
	
	public List<JfMstSoftcopies> getByJmscSoftcopyCodeList(String softcopycode){
		return repoJMSC.findByJmscSoftcopyCodeContaining(softcopycode);
	}
	
	public Optional<JfMstSoftcopies> getJmscSoftcopyCodeCU(String softcopycode){
		return repoJMSC.findByJmscSoftcopyCode(softcopycode);
	}
	
	public String saveUpdateJfMstSoftcopies(JfMstSoftcopies jmsc) {
		repoJMSC.save(jmsc);
		return "Submit Successfully";
	}
	
	public String getDelBySoftcopyCode(String softcopycode) {
		repoJMSC.getDelBySoftcopyCode(softcopycode);
		return "Delete Successfully";
	}
}
