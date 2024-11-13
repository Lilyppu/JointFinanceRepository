package com.JointFinance.Models;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "JF_TRN_BP_PT_HDRS")
public class JfTrnBpPtHdrs {
	@Id
	@Column(name="PT_NO",length=20,  nullable = false)
	private String jtbphNo;
	
	@Column(name="PT_DATE")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date jtbphDate;
	
	@Column(name="SOF_CODE", length=10)
	private String jtbphSofCode;
	
	@Column(name="INTR_RATE_MIN")
	private BigDecimal jtbphRateMin;
	
	@Column(name="OTS_PRNC_MIN")
	private BigDecimal jtbphOtsPrncMin;
	
	@Column(name="PT_STATUS", length=2)
	private String jtbphStatus;
	
	@Column(name="APPROVED_BY", length=15)
	private String jtbphApproveBy;
	
	@Column(name="APPROVED_DATE")
	private Date jtbphApproveDate;
	
	@Column(name="PRETERM_TYPE", length=2)
	private String jtbphPretermType;
	
	@Column(name="CREATED_BY", length=15)
	private String jtbphCreatedBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtbphCreateDate;
	
	@Column(name="LASTUPDATE_BY", length=15)
	private String jtbphUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtbphUpdateDate;
	
	@Column(name="OVD_DAYS")
	private Integer jtbphOvdDays;
	
	@Column(name="OTS_TOP")
	private Integer jtbphOtsTop;
	
	@Column(name="CP_CODE", length=10)
	private String jtbphCpCode;		

}
