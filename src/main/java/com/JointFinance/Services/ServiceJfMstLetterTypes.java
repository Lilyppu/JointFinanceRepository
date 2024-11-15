package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfMstLetterTypes;
import com.JointFinance.Repository.IJfMstLetterTypesRepository;

@Service
public class ServiceJfMstLetterTypes {
	
	@Autowired
	IJfMstLetterTypesRepository repoJMLT;
	
	public List<JfMstLetterTypes> getJmltAll(){
		return repoJMLT.findAll();
	}
	
	public List<JfMstLetterTypes> getJmltByType(String pLetterType){
		return repoJMLT.findByJmltLetterType(pLetterType);
	}

}
