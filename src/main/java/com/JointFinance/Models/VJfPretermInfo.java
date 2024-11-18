package com.JointFinance.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "V_JF_PRETERM_INFO")
public class VJfPretermInfo {
	@Id
	@Column(name="VJPTI_NO",length=20,  nullable = false)
	private String vjptiNo;
	
	@Column(name="VJPTI_SOFCODE",length=10,  nullable = false)
	private String vjptiSofNo;
	
	@Column(name="VJPTI_OTS_PRNC")
	private BigDecimal vjptiOtsPrnc;
	
	@Column(name="VJPTI_OTS_INTR")
	private BigDecimal vjptiIntrPrnc;
	
	@Column(name="VJPTI_DAY_INTR")
	private Integer vjptiDayIntr;
	
	@Column(name="VJPTI_ADM")
	private Integer vjptiAdmin;
	
	@Column(name="VJPTI_CONTRACT_SELECTED")
	private Integer vjptiContractSelected;
	
	@Column(name="VJPTI_CONTRACT_ALL")
	private Integer vjptiContractAll;


}
