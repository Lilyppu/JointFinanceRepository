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
public class JfTrnSofParamDtlsCompKey implements Serializable{

	private String jtspdSofCode;	
	private Integer jtspdVer;	
	private Integer jtspdSeqNo;
	private String jtspdOfficeCode;

}
