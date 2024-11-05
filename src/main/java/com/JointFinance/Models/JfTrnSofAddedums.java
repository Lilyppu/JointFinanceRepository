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

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "JF_TRN_SOF_ADDENDUMS")
@IdClass(JfTrnSofAddedumsCompKey.class)
public class JfTrnSofAddedums {
	@Id
	@Column(name="SOF_CODE",length=10,  nullable = false)
	private String jtsaSofCode;
	
	@Id
	@Column(name="SEQ_NO")
	private Integer jtsaSeqno;
	
	@Column(name="VERSION_NO")
	private Integer jtsaVersion;
	
	@Column(name="ADDENDUM_NO",length=30)
	private String jtsaAddendumNo;
	
	@Column(name="ADDENDUM_DATE")
	 @JsonFormat(pattern = "dd/MM/yyyy")
	private Date jtsaAddendumDate;
	
	@Column(name="EFFECTIVE_DATE")
	 @JsonFormat(pattern = "dd/MM/yyyy")
	private Date jtsaEffectiveDate;
	
	@Column(name="PCT_PORTION")
	private BigDecimal jtsaPctPortion;
	
	@Column(name="INTR_EFF")
	private BigDecimal jtsaIntrEff;
	
	@Column(name="WAIVED_PEN")
	private Integer jtsaWaivePen;
	
	@Column(name="AUTO_WO_DAY")
	private Integer jtsaAutoWoDay;
	
	@Column(name="DISB_NOT_DEC")
	private Integer jtsaDisbNotDec;
	
	@Column(name="DISB_DECEMBER")
	private Integer jtsaDisbDecember;	
	
	@Column(name="INTR_FLAG",length=3)
	private String jtsaIntrFlag;
	
	@Column(name="PCT_OPEX")
	private BigDecimal jtsaPctOpex;
	
	@Column(name="PCT_PROVISI")
	private BigDecimal jtsaPctProvisi;
	
	@Column(name="DIGIT_DECIMAL")
	private BigDecimal jtsaDigitDecimal;

	@Column(name="FIRST_INT_AMT_TYPE",length=10)
	private String jtsaFirstIntAmtType;
	
	@Column(name="DUE_DATE_TYPE",length=10)
	private String jtsaDueDateType;
	
	@Column(name="BANK_CONT_NO_FLAG",length=1)
	private String jtsaBankContNoFlag;
	
	@Column(name="IF_ADVANCE",length=2)
	private String jtsaIfAdvance;
	
	@Column(name="INITIAL_NAME",length=30)
	private String jtsaInitialName;
	
	@Column(name="LAST_INT_AMT_TYPE",length=10)
	private String jtsaLatIntAmtType;
	
	@Column(name="JFIN_TYPE",length=1)
	private String jtsaJfinType;
	
	@Column(name="IF_BUYBACK",length=2)
	private String jtsaIfBuyBack;
	
	@Column(name="PUTBACK_FLAG",length=1)
	private String jtsaPutBackFlag;

	@Column(name="IF_AYD",length=2)
	private String jtsaIfAyd;
	
	@Column(name="VALIDDATE_IS_SYSDATE_PLUS")
	private Integer jtsaValdateIsSysdatePlus;
	
	@Column(name="PEN_RATE")
	private BigDecimal jtsaPenRate;
	
	@Column(name="LETT_LANG",length=1)
	private String jtsaLettLang;
	
	@Column(name="PCT_ADMIN_PT")
	private BigDecimal jtsaPctAdminPt;
	
	@Column(name="CAP_RISK")
	private BigDecimal jtsaCapRisk;
	
	@Column(name="CROSS_PV_ADVANCE",length=1)
	private String jtsaCrossPvAdvance;
	
	@Column(name="PAYMENT_DATE_TYPE",length=2)
	private String jtsaPaymentDateType;
	
	@Column(name="NEED_PRE_SC",length=1)
	private String jtsaNeedPreSc;
	
	@Column(name="PT_IN_WEEKEND",length=2)
	private String jtsaPtinWeeked;
	
	@Column(name="GRACE_PENALTY",length=2)
	private BigDecimal jtsaGracePenalty;
	
	@Column(name="FORMULA_PENALTY",length=2000)
	private String jtsaFormulaPenalty;
	
	@Column(name="PENALTY_PENDING",length=2)
	private String jtsaPenaltyPending;
	
	@Column(name="EARLY_PAID_HOLD",length=2)
	private String jtsaEarlypaidHold;
	
	@Column(name="PARTIAL_PAID_HOLD",length=2)
	private String jtsaPartialPaidHold;
	
	@Column(name="CREATED_BY",length=15)
	private String jtsaCreateBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtsaCreateDate;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jtsaUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtsaUpdateDate;
	
	@Column(name="IF_RESCHEDULING",length=2)
	private String jtsaIfrescheduling;
	
	@Column(name="BIAYA_ADMIN")
	private Integer jtsaBiayaAdmin;
	
	@Column(name="BIAYA_BPKB")
	private Integer jtsaBiayaBpkb;
	
	@Column(name="IS_ACTUAL_DAY",length=1)
	private String jtsaIsActualDay;
	
	@Column(name="BIAYA_ADMIN_TYPE",length=3)
	private String jtsaBiayaAdminType;
	
	@Column(name="BIAYA_BPKB_TYPE",length=3)
	private String jtsaBiayaBpkbType;
	
	@Column(name="IF_PRETERM",length=2)
	private String jtsaIfPreterm;
	
	@Column(name="IF_CHG_DUEDATE",length=2)
	private String jtsaIfChgDueDate;
	
	@Column(name="DP_MINIMAL",length=2)
	private Integer jtsaDpMinimal;
	
	@Column(name="DISC_INT_FLAG",length=2)
	private String jtsaDiscIntFlag;
	
	@Column(name="INST_NO_DISC")
	private Integer jtsaInstNoDisc;
	
	@Column(name="FORMULA_DP",length=100)
	private String jtsaFormulaDp;
	
	@Column(name="IF_REVERSE",length=2)
	private String jtsaIfReverse;
	


	
	
	
}
