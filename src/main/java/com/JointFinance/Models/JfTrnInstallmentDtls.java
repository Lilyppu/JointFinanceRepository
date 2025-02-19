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
@IdClass(JfTrnInstallmentDtlsCompKey.class)
@Table(name = "JF_TRN_INSTALLMENT_DTLS")
public class JfTrnInstallmentDtls {
	
	@Id
	@Column(name="SOF_CODE",length=10)
	private String jtidSofCode;
	
	@Id
	@Column(name="SEQ_NO")
	private Integer jtidSeqNo;
	
	@Id
	@Column(name="CONTRACT_NO",length=20)
	private String jtidContractNo;
	
	@Id
	@Column(name="VERSION_NO")
	private Integer jtidVersionNo;
	
	@Id
	@Column(name="INST_NO")
	private Integer jtidInstNo;
	
	@Id
	@Column(name="PAID_SEQ")
	private Integer jtidPaidSeq;
	
	@Column(name="PAID_DATE")
	private Date jtidPaidDate;
	
	@Column(name="PAID_STATUS",length=2)
	private String jtidPaidStatus;
	
	@Column(name="PRNC_AMT_PAID")
	private BigDecimal jtidPrncAmtPaid;
	
	@Column(name="INTR_AMT_PAID")
	private BigDecimal jtidIntrAmtPaid;
	
	@Column(name="LETTER_NO",length=35)
	private String jtidLetterNo;
	
	@Column(name="LETTER_DATE")
	private Date jtidLetterDate;
	
	@Column(name="REFERENCE_NO",length=20)
	private String jtidReferenceNo;
	
	@Column(name="REFERENCE_DATE")
	private Date jtidReferenceDate;
	
	@Column(name="PENALTY_PAID")
	private BigDecimal jtidPenaltyPaid;
	
	@Column(name="CLOSED_YEAR")
	private Integer jtidClosedYear;
	
	@Column(name="CREATED_BY",length=15)
	private String jtidCreatedBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtidCreatedTimestamp;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jtidLastupdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtidLastupdateTimestamp;
	
	@Column(name="TRANS_DATE")
	private Date jtidTransDate;
	
	@Column(name="CUST_PRNC_AMT_PAID")
	private BigDecimal jtidCustPrncAmtPaid;
	
	@Column(name="CUST_INTR_AMT_PAID")
	private BigDecimal jtidCustIntrAmtPaid;
	
	@Column(name="CUST_PENALTY_PAID")
	private BigDecimal jtidCustPenaltyPaid;
	
	@Column(name="CUST_REFERENCE_NO",length=20)
	private String jtidCustReferenceNo;
}
