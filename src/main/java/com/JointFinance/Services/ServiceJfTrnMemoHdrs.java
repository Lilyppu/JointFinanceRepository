package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.JointFinance.Models.JfTrnMemoHdrs;
import com.JointFinance.Repository.IJfTrnMemoHdrsRepository;

@Service
public class ServiceJfTrnMemoHdrs {
	
	@Autowired
	IJfTrnMemoHdrsRepository repoJTMH;
	
	public List<JfTrnMemoHdrs> getJtmhList(String SofCode, String ReffLetterNo){	
		return repoJTMH.findByJtmhSofCodeAndJtmhReffLetterNo(SofCode, ReffLetterNo);
	}
	
	public String saveUpdateMemoHdrs(@RequestBody JfTrnMemoHdrs jtmh) {
		repoJTMH.save(jtmh);
		return "Submit Successfully";
	}

}
