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
@Table(name = "JF_HST_SOF_ADDENDUMS")
@IdClass(JfHstSofAddedumsCompKey.class)
public class JfHstSofAddedums {
	
	@Id
	@Column(name="SOF_CODE",length=10,  nullable = false)
	private String jhsaSofCode;
	
	@Id
	@Column(name="SEQ_NO")
	private Integer jhsaSeqno;
	
	@Column(name="VERSION_NO")
	private Integer jhsaVersion;
	
	@Column(name="ADDENDUM_NO",length=30)
	private String jhsaAddendumNo;
	
	@Column(name="ADDENDUM_DATE")
	private Date jhsaAddendumDate;
	
	@Column(name="EFFECTIVE_DATE")
	private Date jhsaEffectiveDate;
	
	@Column(name="PCT_PORTION")
	private BigDecimal jhsaPctPortion;
	
	@Column(name="INTR_EFF")
	private BigDecimal jhsaIntrEff;
	
	@Column(name="WAIVED_PEN")
	private Integer jhsaWaivePen;
	
	@Column(name="AUTO_WO_DAY")
	private Integer jhsaAutoWoDay;
	
	@Column(name="DISB_NOT_DEC")
	private Integer jhsaDisbNotDec;
	
	@Column(name="DISB_DECEMBER")
	private Integer jhsaDisbDecember;	
	
	@Column(name="INTR_FLAG",length=3)
	private String jhsaIntrFlag;
	
	@Column(name="PCT_OPEX")
	private BigDecimal jhsaPctOpex;
	
	@Column(name="PCT_PROVISI")
	private BigDecimal jhsaPctProvisi;
	
	@Column(name="DIGIT_DECIMAL")
	private BigDecimal jhsaDigitDecimal;

	@Column(name="FIRST_INT_AMT_TYPE",length=10)
	private String jhsaFirstIntAmtType;
	
	@Column(name="DUE_DATE_TYPE",length=10)
	private String jhsaDueDateType;
	
	@Column(name="BANK_CONT_NO_FLAG",length=1)
	private String jhsaBankContNoFlag;
	
	@Column(name="IF_ADVANCE",length=2)
	private String jhsaIfAdvance;
	
	@Column(name="INITIAL_NAME",length=30)
	private String jhsaInitialName;
	
	@Column(name="LAST_INT_AMT_TYPE",length=10)
	private String jhsaLatIntAmtType;
	
	@Column(name="JFIN_TYPE",length=1)
	private String jhsaJfinType;
	
	@Column(name="IF_BUYBACK",length=2)
	private String jhsaIfBuyBack;
	
	@Column(name="PUTBACK_FLAG",length=1)
	private String jhsaPutBackFlag;
	
	@Column(name="JTSA_SYARIAH_FLAG",length=1)
	private String jhsaSyariahFlag;
	
	@Column(name="IF_AYD",length=2)
	private String jhsaIfAyd;
	
	@Column(name="VALIDDATE_IS_SYSDATE_PLUS")
	private Integer jhsaValdateIsSysdatePlus;
	
	@Column(name="IF_SOLD",length=2)
	private String jhsaIfSold;
	
	@Column(name="PEN_RATE")
	private BigDecimal jhsaPenRate;
	
	@Column(name="LETT_LANG",length=1)
	private String jhsaLettLang;
	
	@Column(name="PCT_ADMIN_PT")
	private BigDecimal jhsaPctAdminPt;
	
	@Column(name="CAP_RISK")
	private BigDecimal jhsaCapRisk;
	
	@Column(name="CROSS_PV_ADVANCE",length=1)
	private String jhsaCrossPvAdvance;
	
	@Column(name="PAYMENT_DATE_TYPE",length=2)
	private String jhsaPaymentDateType;
	
	@Column(name="NEED_PRE_SC",length=1)
	private String jhsaNeedPreSc;
	
	@Column(name="PT_IN_WEEKEND",length=2)
	private String jhsaPtinWeeked;
	
	@Column(name="GRACE_PENALTY",length=2)
	private BigDecimal jhsaGracePenalty;
	
	@Column(name="FORMULA_PENALTY",length=2000)
	private String jhsaFormulaPenalty;
	
	@Column(name="PENALTY_PENDING",length=2)
	private String jhsaPenaltyPending;
	
	@Column(name="EARLY_PAID_HOLD",length=2)
	private String jhsaEarlypaidHold;
	
	@Column(name="PARTIAL_PAID_HOLD",length=2)
	private String jhsaPartialPaidHold;
	
	@Column(name="CREATED_BY",length=15)
	private String jhsaCreateBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jhsaCreateDate;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jhsaUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jhsaUpdateDate;
	
	@Column(name="IF_RESCHEDULING",length=2)
	private String jhsaIfrescheduling;
	
	@Column(name="BIAYA_ADMIN")
	private Integer jhsaBiayaAdmin;
	
	@Column(name="BIAYA_BPKB")
	private Integer jhsaBiayaBpkb;
	
	@Column(name="IS_ACTUAL_DAY",length=1)
	private String jhsaIsActualDay;
	
	@Column(name="BIAYA_ADMIN_TYPE",length=3)
	private String jhsaBiayaAdminType;
	
	@Column(name="BIAYA_BPKB_TYPE",length=3)
	private String jhsaBiayaBpkbType;
	
	@Column(name="IF_PRETERM",length=2)
	private String jhsaIfPreterm;
	
	@Column(name="IF_CHG_DUEDATE",length=2)
	private String jhsaIfChgDueDate;
	
	@Column(name="DP_MINIMAL",length=2)
	private Integer jhsaDpMinimal;
	
	@Column(name="DISC_INT_FLAG",length=2)
	private String jhsaDiscIntFlag;
	
	@Column(name="INST_NO_DISC")
	private Integer jhsaInstNoDisc;
	
	@Column(name="FORMULA_DP",length=100)
	private String jhsaFormulaDp;
	
	@Column(name="IF_REVERSE",length=2)
	private String jhsaIfReverse;

}
