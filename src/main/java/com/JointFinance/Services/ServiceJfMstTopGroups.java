package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfMstTopGroups;
import com.JointFinance.Repository.IJfMstTopGroupsRepository;

@Service
public class ServiceJfMstTopGroups {

	@Autowired
	IJfMstTopGroupsRepository repoJMTG;

	public List<JfMstTopGroups> getJmtgAll(){
		return repoJMTG.findAll();
	}
	
	public List<JfMstTopGroups> getByJmtgTopId(Integer topid){
		return repoJMTG.findAllByJmtgTopId(topid);
	}
	
	public Optional<JfMstTopGroups> getJmtgByTopIdSingle(Integer topid){
		return repoJMTG.findByJmtgTopId(topid);
	}
	
	public String saveUpdateJfMstTopGroups(JfMstTopGroups jmtg) {
		repoJMTG.save(jmtg);
		return "Submit Successfully";
	}
	
	public String getDelJmtgById(Integer topid) {
		repoJMTG.getDelJmtgById(topid);
		return "Delete Successfully";
	}
}
