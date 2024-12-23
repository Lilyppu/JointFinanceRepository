package com.JointFinance.Models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class JfTrnSofMonthlyTargetsCompKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String jtsmtSofCode;
	private Integer jtsmtTargetYear;
	private Integer jtsmtTargetMonth;
}
