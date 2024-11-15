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
@Table(name = "JF_TRN_BP_PT_DTLS")
@IdClass(JfTrnBpPtDtlsCompKey.class)
public class JfTrnBpPtDtls {
	
	@Id
	@Column(name="PT_NO",length=20,  nullable = false)
	private String jtbpdNo;
	
	@Id
	@Column(name="CONTRACT_NO",length=20,  nullable = false)
	private String jtbpdContractNo;
	
	@Id
	@Column(name="SEQ_NO")
	private Integer jtbpdSeqNo;
	
	@Column(name="INTR_RATE_EFF")
	private BigDecimal jtbpdIntrRateEff;
	
	@Column(name="OTS_PRNC_AMT")
	private BigDecimal jtbpdPrncAmt;
	
	@Column(name="INST_NO")
	private Integer jtbpdInstNo;
	
	@Column(name="PT_STATUS", length=2)
	private String jtbpdPtStatus;
	
	@Column(name="CREATED_BY", length=15)
	private String jtbpdCreateBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtbpdCreateDate;
	
	@Column(name="LASTUPDATE_BY", length=15)
	private String jtbpdUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtbpdUpdateDate;
	
	@Column(name="SOF_CODE", length=10)
	private String jtbpdSofCode;
	
	@Column(name="DAY_INTR")
	private Integer jtbpdDayIntr;
	
	@Column(name="ADMIN")
	private BigDecimal jtbpdAdmin;
	
	@Column(name="KETERANGAN", length=300)
	private String jtbpdKeterangan;

}
