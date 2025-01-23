package com.JointFinance.Models;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "V_JF_CONT_INFO")
public class VJfContInfo {
	@Id
	@Column(name="VJCI_CONTRACT_NO",length=20)
	private String vjciContractNo;
	
	@Column(name="VJCI_LETTER_NO",length=35)
	private String vjciLetterNo;
	
	@Column(name="VJCI_LETTER_DATE")
	private Date vjciLetterDate;
	
	@Column(name="VJCI_RV_NO",length=20)
	private String vjciRvNo;
	
	@Column(name="VJCI_RV_DATE")
	private Date vjciRvDate;
	
	@Column(name="VJCI_AUTO_WO_DATE")
	private Date vjciAutoWoDate;
	
	@Column(name="VJCI_FIRST_INST_TYPE",length=2)
	private String vjciFirstInstType;
	
	@Column(name="VJCI_FIRST_INST_DATE")
	private Date vjciFirstInstDate;
	
	@Column(name="VJCI_TOP")
	private Integer vjciTop;
	
	@Column(name="VJCI_INTR_AMT")
	private BigDecimal vjciIntrAmt;
	
	@Column(name="VJCI_INTR_AMT_PAID",length=1)
	private BigDecimal vjciIntrAmtPaid;
	
	@Column(name="VJCI_OTS_INTR_AMT",length=50)
	private BigDecimal vjciOtsIntrAmt;
	
	@Column(name="VJCI_PRNC_AMT",length=100)
	private BigDecimal vjciPrncAmt;
	
	@Column(name="VJCI_PRNC_AMT_PAID",length=10)
	private BigDecimal vjciAmtPaid;

	@Column(name="VJCI_OTS_PRNC_AMT")
	private BigDecimal vjciOtsPrncAmt;
	
	@Column(name="VJCI_OTS_AMT")
	private BigDecimal vjciOtsAmt;
	
	@Column(name="VJCI_INTR_TYPE",length=2)
	private String vjciIntrType;
	
	@Column(name="VJCI_MONTHLY_INST")
	private Integer vjciMonthlyInst;
	
	@Column(name="VJCI_PCT_PENALTY")
	private Integer vjciPctPenalty;
	
	@Column(name="VJCI_LAST_INST")
	private Integer vjciLastInst;

	@Column(name="VJCI_NEXT_INST_NO")
	private Integer vjciNextInstNo;
	
	@Column(name="VJCI_NEXT_DUE_DATE")
	private Date vjciNextDueDate;
	
	@Column(name="VJCI_PLAN_DATE")
	private Date vjciPlanDate;
	
	@Column(name="VJCI_PT_NO",length=20)
	private String vjciPtNo;

	@Column(name="VJCI_PT_STATUS",length=2)
	private String vjciPtStatus;
	
	@Column(name="VJCI_DESCRIPTION",length=50)
	private String vjciDescription;
}

