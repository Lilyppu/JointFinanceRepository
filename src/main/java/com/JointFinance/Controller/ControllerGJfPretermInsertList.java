package com.JointFinance.Controller;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JointFinance.Services.ServiceGJfPretermInsertList;


@RestController
public class ControllerGJfPretermInsertList {
	@Autowired
	ServiceGJfPretermInsertList servGJPTIL;
	
	@GetMapping("/jf/getGjptilList")
	public List<GJfPretermInsertList> getGjptilList(String pdate , String psofcode , Integer ptop, Integer povd , BigDecimal prateminr, BigDecimal pprincmin){
		String pmsg=servGJPTIL.RunGjptilList(pdate, psofcode, ptop, povd, prateminr, pprincmin);
		System.out.println("aaaaa :"+pmsg);
		return servGJPTIL.getGjptilList(psofcode);
	}
}
