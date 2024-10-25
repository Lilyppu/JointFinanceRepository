package com.JointFinance.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class JfTrnSofBasCompKey {
	
	private String jtsbSofCode;
	
	private Integer jtsbSeqNo;
	
	private String jtsbAcctNo;

}
