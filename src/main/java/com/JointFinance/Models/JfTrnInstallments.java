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
@IdClass(JfTrnInstallmentsCompKey.class)
@Table(name = "JF_TRN_INSTALLMENTS")
public class JfTrnInstallments {
	@Id
	@Column(name="SOF_CODE",length=10)
	private String jtisSofCode;
	
	@Id
	@Column(name="SEQ_NO")
	private Integer jtisSeqNo;
	
	@Id
	@Column(name="CONTRACT_NO",length=20)
	private String jtisContractNo;
	
	@Column(name="VERSION_NO")
	private Integer jtisVersionNo;
	
	@Id
	@Column(name="INST_NO")
	private Integer jtisInstNo;
	
	@Column(name="INST_NO_ORIGINAL")
	private Integer jtisInstNoOriginal;
	
	@Column(name="DUE_DATE")
	private Date jtisPaidSeq;
	
	@Column(name="PAID_DATE")
	private Date jtisPaidDate;
	
	@Column(name="PAID_STATUS",length=2)
	private String jtisPaidStatus;
	
	@Column(name="PRNC_AMT")
	private BigDecimal jtisPrncAmt;
	
	@Column(name="PRNC_AMT_PAID")
	private BigDecimal jtisPrncAmtPaid;
	
	@Column(name="INTR_AMT")
	private BigDecimal jtisIntrAmt;
	
	@Column(name="INTR_AMT_PAID")
	private BigDecimal jtisIntrAmtPaid;
	
	@Column(name="LETTER_NO",length=35)
	private String jtisLetterNo;
	
	@Column(name="PV_NO",length=20)
	private String jtisPvNo;
	
	@Column(name="PV_DATE")
	private Date jtisPvDate;
	
	@Column(name="CONT_REL_NO")
	private Integer jtisContRelNo;
	
	@Column(name="INVOICE_NO",length=20)
	private String jtisInvoiceNo;
	
	@Column(name="INVOICE_DATE")
	private Date jtisInvoiceDate;
	
	@Column(name="LETTER_DATE")
	private Date jtisLetterDate;
	
	@Column(name="PENALTY_AMT")
	private BigDecimal jtisPenaltyAmt;
	
	@Column(name="PENALTY_PAID")
	private BigDecimal jtisPenaltyPaid;
	
	@Column(name="PENALTY_PAID_DATE")
	private Date jtisPenaltyPaidDate;
	
	@Column(name="LAST_PAYMENT_SEQ")
	private Integer jtisLastPaymentSeq;
	
	@Column(name="PRNC_AMT_TEMP")
	private BigDecimal jtisPrncAmtTemp;
	
	@Column(name="INTR_AMT_TEMP")
	private BigDecimal jtisIntrAmtTemp;

	@Column(name="CLOSED_YEAR")
	private Integer jtisClosedYear;
	
	@Column(name="CREATED_BY",length=15)
	private String jtisCreatedBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtisCreatedTimestamp;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jtisLastupdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtisLastupdateTimestamp;
	
	@Column(name="PENALTY_TEMP")
	private Integer jtisPenaltyTemp;
}
