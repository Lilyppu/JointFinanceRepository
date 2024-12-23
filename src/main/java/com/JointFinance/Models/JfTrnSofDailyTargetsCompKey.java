package com.JointFinance.Models;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class JfTrnSofDailyTargetsCompKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String jtsdtSofCode;
	private Date jtsdtTargetDate;
}
