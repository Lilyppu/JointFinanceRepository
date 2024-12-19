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
public class JfTmpSofIntrRatesCompKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2078981914552596454L;
	private String jtmsirSofCode;	
	private Integer jtmsirSeqNo;
}
