package com.JointFinance.Controller;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

import com.JointFinance.Models.GJfPretermInsertListCompKey;
import com.JointFinance.Models.JfHstSofAddedumsCompKey;
import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "G_JF_PRETERM_INSERT_LIST")
@IdClass(GJfPretermInsertListCompKey.class)
public class GJfPretermInsertList {
	@Id
	@Column(name="GJPTIL_SOF_CODE",length=30,  nullable = false)
	private String gjptilSofCode;
	
	@Id
	@Column(name="GJPTIL_CONTRACT_NO",length=30,  nullable = false)
	private String gjptilContractNo;
	
	@Column(name="GJPTIL_SEQ_NO")
	private Integer gjptilSeqNo;
	
	@Column(name="GJPTIL_ALIAS",length=30,  nullable = false)
	private String gjptilAlias;
	

	@Column(name="GJPTIL_CONTRACT_STATUS",length=3)
	private String gjptilContractStatus;
	
	@Column(name="GJPTIL_INST_NO")
	private Integer gjptilInstNo;
	
	@Column(name="GJPTIL_INTR_RATE_EFF")
	private BigDecimal gjptilIntrRateEff;
	
	@Column(name="GJPTIL_OTS_PRNC_AMT")
	private BigDecimal gjptilOtsPrncAmt;
	
	@Column(name="GJPTIL_OTS_INT_AMT")
	private BigDecimal gjptilOtsIntrAmt;
	
	@Column(name="GJPTIL_DAY_INTR")
	private Integer gjptilDayIntr;
	
	@Column(name="GJPTIL_ADMIN")
	private Integer gjptilAdmin;

	@Column(name="PT_STATUS",length=3)
	private String gjptilStatus;  
	
}
