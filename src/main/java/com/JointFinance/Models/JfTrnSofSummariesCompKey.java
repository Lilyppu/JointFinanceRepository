package com.JointFinance.Models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class JfTrnSofSummariesCompKey {
	private String jtssSofCode;
	private Integer jtssTopId;
	private Date jtssSofDate;
}
