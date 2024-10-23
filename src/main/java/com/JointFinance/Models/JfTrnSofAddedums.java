package com.JointFinance.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "JF_TRN_SOF_ADDENDUMS")
@IdClass(JFTrnSofCpsCompKey.class)

public class JfTrnSofAddedums {
	@Id
	@Column(name="JTSA_SOF_CODE",length=10,  nullable = false)
	private String jtsaSofCode;
	
	@Id
	@Column(name="JTSA_SEQ_NO")
	private Integer jtsaSeqno;
	
	@Column(name="JTSA_VERSION_NO")
	private Integer jtsaVersion;
	
	@Column(name="JTSA_ADDENDUM_NO",length=30)
	private String jtsaAddendumNo;
	
	@Column(name="JTSA_ADDENDUM_DATE")
	private Date jtsaAddendumDate;
	
	@Column(name="JTSA_EFFECTIVE_DATE")
	private Date jtsaEffectiveDate;
	
	@Column(name="JTSA_PCT_PORTION")
	private BigDecimal jtsaPctPortion;
	
	@Column(name="JTSA_INTR_EFF")
	private BigDecimal jtsaIntrEff;
	
	@Column(name="JTSA_WAIVED_PEN")
	private Integer jtsaWaivePen;
	
	@Column(name="JTSA_AUTO_WO_DAY")
	private Integer jtsaAutoWoDay;
	
	@Column(name="JTSA_DISB_NOT_DEC")
	private Integer jtsaDisbNotDec;
	
	@Column(name="JTSA_DISB_DECEMBER")
	private Integer jtsaDisbDecember;	
	
	@Column(name="JTSA_INTR_FLAG",length=3)
	private String jtsaIntrFlag;
	
	@Column(name="JTSA_PCT_OPEX")
	private BigDecimal jtsaPctOpex;
	
	@Column(name="JTSA_PCT_PROVISI")
	private BigDecimal jtsaPctProvisi;
	
	@Column(name="JTSA_DIGIT_DECIMAL")
	private BigDecimal jtsaDigitDecimal;

	@Column(name="JTSA_FIRST_INT_AMT_TYPE",length=10)
	private String jtsaFirstIntAmtType;
	
	@Column(name="JTSA_DUE_DATE_TYPE",length=10)
	private String jtsaDueDateType;
	
	@Column(name="JTSA_BANK_CONT_NO_FLAG",length=1)
	private String jtsaBankContNoFlag;
	
	@Column(name="JTSA_IF_ADVANCE",length=2)
	private String jtsaIfAdvance;
	
	@Column(name="JTSA_INITIAL_NAME",length=30)
	private String jtsaInitialName;
	
	@Column(name="JTSA_LAST_INT_AMT_TYPE",length=10)
	private String jtsaLatIntAmtType;
	
	@Column(name="JTSA_JFIN_TYPE",length=1)
	private String jtsaJfinType;
	
	@Column(name="JTSA_IF_BUYBACK",length=2)
	private String jtsaIfBuyBack;
	
	@Column(name="JTSA_PUTBACK_FLAG",length=1)
	private String jtsaPutBackFlag;
	
	@Column(name="JTSA_SYARIAH_FLAG",length=1)
	private String jtsaSyariahFlag;
	
	@Column(name="JTSA_IF_AYD",length=2)
	private String jtsaIfAyd;
	
	@Column(name="JTSA_VALIDDATE_IS_SYSDATE_PLUS")
	private Integer jtsaValdateIsSysdatePlus;
	
	@Column(name="JTSA_IF_SOLD",length=2)
	private String jtsaIfSold;
	
	@Column(name="JTSA_PEN_RATE")
	private BigDecimal jtsaPenRate;
	
	@Column(name="JTSA_LETT_LANG",length=1)
	private String jtsaLettLang;
	
	@Column(name="JTSA_PCT_ADMIN_PT")
	private BigDecimal jtsaPctAdminPt;
	
	@Column(name="JTSA_CAP_RISK")
	private BigDecimal jtsaCapRisk;
	
	@Column(name="JTSA_CROSS_PV_ADVANCE",length=1)
	private String jtsaCrossPvAdvance;
	
	@Column(name="JTSA_PAYMENT_DATE_TYPE",length=2)
	private String jtsaPaymentDateType;
	
	@Column(name="JTSA_NEED_PRE_SC",length=1)
	private String jtsaNeedPreSc;
	
	@Column(name="JTSA_PT_IN_WEEKEND",length=2)
	private String jtsaPtinWeeked;
	
	@Column(name="JTSA_GRACE_PENALTY",length=2)
	private BigDecimal jtsaGracePenalty;
	
	@Column(name="JTSA_FORMULA_PENALTY",length=2000)
	private String jtsaFormulaPenalty;
	
	@Column(name="JTSA_PENALTY_PENDING",length=2)
	private String jtsaPenaltyPending;
	
	@Column(name="JTSA_EARLY_PAID_HOLD",length=2)
	private String jtsaEarlypaidHold;
	
	@Column(name="JTSA_PARTIAL_PAID_HOLD",length=2)
	private String jtsaPartialPaidHold;
	
	@Column(name="JTSA_CREATED_BY",length=15)
	private String jtsaCreateBy;
	
	@Column(name="JTSA_CREATED_TIMESTAMP")
	private Date jtsaCreateDate;
	
	@Column(name="JTSA_LASTUPDATE_BY",length=15)
	private String jtsaUpdateBy;
	
	@Column(name="JTSA_LASTUPDATE_TIMESTAMP")
	private Date jtsaUpdateDate;
	
	@Column(name="JTSA_IF_RESCHEDULING",length=2)
	private String jtsaIfrescheduling;
	
	@Column(name="JTSA_BIAYA_ADMIN")
	private Integer jtsaBiayaAdmin;
	
	@Column(name="JTSA_BIAYA_BPKB")
	private Integer jtsaBiayaBpkb;
	
	@Column(name="JTSA_IS_ACTUAL_DAY",length=1)
	private String jtsaIsActualDay;
	
	@Column(name="JTSA_BIAYA_ADMIN_TYPE",length=3)
	private String jtsaBiayaAdminType;
	
	@Column(name="JTSA_BIAYA_BPKB_TYPE",length=3)
	private String jtsaBiayaBpkbType
	
	@Column(name="JTSA_IF_PRETERM",length=2)
	private String jtsaIfPreterm;
	
	@Column(name="JTSA_IF_CHG_DUEDATE",length=2)
	private String jtsaIfChgDueDate;
	
	@Column(name="JTSA_DP_MINIMAL",length=2)
	private Integer jtsaDpMinimal;
	
	@Column(name="JTSA_DISC_INT_FLAG",length=2)
	private String jtsaDiscIntFlag;
	
	@Column(name="JTSA_INST_NO_DISC")
	private Integer jtsaInstNoDisc;
	
	@Column(name="JTSA_FORMULA_DP",length=100)
	private String jtsaFormulaDp;
	
	@Column(name="JTSA_IF_REVERSE",length=2)
	private String jtsaIfReverse;
	
	          
	         
	             
	            
	   

}
