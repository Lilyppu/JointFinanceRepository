package com.JointFinance.Services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Controller.GJfPretermInsertList;
import com.JointFinance.Repository.IGJfPretermInsertListRepository;



@Service
public class ServiceGJfPretermInsertList {
	@Autowired
	IGJfPretermInsertListRepository repoGJPTIL;
	
	public String RunGjptilList(String pdate , String psofcode , Integer ptop, Integer povd , BigDecimal prateminr, BigDecimal pprincmin){
        return repoGJPTIL.runInsertList(pdate, psofcode, ptop, povd, prateminr, pprincmin);
	}
	
	public List<GJfPretermInsertList> getGjptilList( String psofcode ){		
		return repoGJPTIL.findByGjptilSofCode(psofcode);
	}
	
}
