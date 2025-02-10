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
@Table(name = "V_JF_TRN_CONTRACT_LOV")
@IdClass(LovJtclContractCompkey.class)
public class LovJtclContract {
	
	@Id
	@Column(name="VJTCL_SOF_CODE",length=10,  nullable = false)
	private String vjtclSofCode;
	
	@Id
	@Column(name="VJTCL_CONTRACT_NO",length=20)
	private String vjtclContractNo;
	
	@Column(name="VJTCL_SEQ_NO")
	private Integer vjtclSeqNo;
	
	@Column(name="VJTCL_VERSION_NO")
	private Integer vjtclVersionNo;
	
	@Column(name="VJTCL_CONTRACT_STATUS",length=2)
	private String vjtclContractStatus;
	
	@Column(name="VJTCL_FIRST_INST_TYPE",length=2)
	private String vjtclFirstInstType;
	
	@Column(name="VJTCL_FIRST_INST_DATE")
	private Date vjtclFirstInstDate;
	
	@Column(name="VJTCL_TOP")
	private Integer vjtclTop;
	
	@Column(name="VJTCL_PRNC_AMT")
	private BigDecimal vjtclPrncAmt;
	
	@Column(name="VJTCL_PRNC_AMT_PAID")
	private BigDecimal vjtclPrncAmtPaid;
	
	@Column(name="VJTCL_INTR_AMT")
	private BigDecimal vjtclIntrAmt;
	
	@Column(name="VJTCL_INTR_AMT_PAID")
	private BigDecimal vjtclIntrAmtPaid;
	
	@Column(name="VJTCL_INTR_TYPE",length=2)
	private String vjtclIntrType;
	
	@Column(name="VJTCL_INTR_RATE_EFF")
	private BigDecimal vjtclIntrRateEff;
	
	@Column(name="VJTCL_INTR_RATE_FLAT")
	private BigDecimal vjtclIntrRateFlat;
	
	@Column(name="VJTCL_OPEX_RATE_EFF")
	private BigDecimal vjtclOpexRateEff;
	
	@Column(name="VJTCL_MONTHLY_INST")
	private BigDecimal vjtclMonthlyInst;
	
	@Column(name="VJTCL_PCT_PENALTY")
	private BigDecimal vjtclPctPenalty;
	
	@Column(name="VJTCL_DPD")
	private Integer vjtclDpd;
	
	@Column(name="VJTCL_PCT_PORTION")
	private BigDecimal vjtclPctPortion;
	
	@Column(name="VJTCL_WO_FLAG",length=1)
	private String vjtclWoFlag;
	
	@Column(name="VJTCL_BANK_ID",length=17)
	private String vjtclBankId;
	
	@Column(name="VJTCL_LETTER_NO",length=35)
	private String vjtclLetterNo;
	
	@Column(name="VJTCL_LETTER_DATE")
	private Date vjtclLetterDate;
	
	@Column(name="VJTCL_RV_NO",length=20)
	private String vjtclRvNo;
	
	@Column(name="VJTCL_RV_DATE")
	private Date vjtclRvDate;
	
	@Column(name="VJTCL_PV_NO",length=20)
	private String vjtclPvNo;
	
	@Column(name="VJTCL_PV_DATE")
	private Date vjtclPvDate;
	
	@Column(name="VJTCL_PLAN_DATE")
	private Date vjtclPlanDate;
	
	@Column(name="VJTCL_RELEASE_NO")
	private Integer vtclReleaseNo;
	
	@Column(name="VJTCL_PV_LETTER_NO",length=35)
	private String vjtclPvLetterNo;
	
	@Column(name="VJTCL_PV_LETTER_DATE")
	private Date vjtclPvLetterDate;
	
	@Column(name="VJTCL_COY_ID",length=5)
	private String vjtclCoyId;
	
	@Column(name="VJTCL_BUSS_UNIT",length=5)
	private String vjtclBussUnit;
	
	@Column(name="VJTCL_PLATFORM",length=1)
	private String vjtclPlatform;
	
	@Column(name="VJTCL_LAST_INST")
	private Integer vjtclLastInst;
	
	@Column(name="VJTCL_AUTO_WO_DATE")
	private Date vjtclAutoWoDate;
	
	@Column(name="VJTCL_IS_AUTO_WO",length=1)
	private String vjtclIsAutoWo;
	
	@Column(name="VJTCL_APPL_NO",length=20)
	private String vjtclApplNo;
	
	@Column(name="VJTCL_PROSES_STATUS",length=2)
	private String vjtclProsesStatus;
	
	@Column(name="VJTCL_NEXT_INST_NO")
	private Integer vjtclNextInstNo;
	
	@Column(name="VJTCL_NEXT_DUE_DATE")
	private Date vjtclNextDueDate;
	
	@Column(name="VJTCL_CREATED_BY",length=15)
	private String vjtclCreatedBy;
	
	@Column(name="VJTCL_CREATED_TIMESTAMP")
	private Date vjtclCreatedTimestamp;
	
	@Column(name="VJTCL_LASTUPDATE_BY",length=15)
	private String vjtclLastupdateBy;
	
	@Column(name="VJTCL_LASTUPDATE_TIMESTAMP")
	private Date vjtclLastupdateTimestamp;
	
	@Column(name="VJTCL_ORIGINAL_DAY")
	private Integer vjtclOriginalDay;
	
	@Column(name="VJTCL_PRNC_AMT_TEMP")
	private BigDecimal vjtclPrncAmtTemp;
	
	@Column(name="VJTCL_INTR_AMT_TEMP")
	private BigDecimal vjtclIntrcAmtTemp;
	
	@Column(name="VJTCL_CLOSED_DATE")
	private Date vjtclClosedDate;
	
	@Column(name="VJTCL_IDENTITAS_DEBITUR",length=30)
	private String vjtclIdentitasDebitur;
	
	@Column(name="VJTCL_JOINFINANCEID",length=10)
	private String vjtclJoinfinanceId;
	
	@Column(name="VJTCL_INST_AMT")
	private Integer vjtclInstAmt;
	
	@Column(name="VJTCL_CP_CODE",length=7)
	private String vjtclCpCode;
	
	@Column(name="VJTCL_ALIASES",length=10)
	private String vjtclAliases;
	
	@Column(name="VJTCL_JF_MODEL",length=2)
	private String vjtclJfModel;
	
	@Column(name="VJTCL_CUST_NAME",length=60)
	private String vjtclCustName;

}
