package com.JointFinance.Models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "JF_TRN_SOF_SUMMARIES")
@IdClass(JfTrnSofSummariesCompKey.class)
public class JfTrnSofSummaries implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SOF_CODE", length=10, nullable = false)
	private String jtssSofCode;
	
	@Id
	@Column(name="TOP_ID", nullable = false)
	private Integer jtssTopId;
	
	@Id
	@Column(name="SOF_DATE", nullable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date jtssSofDate;
	
	@Column(name="PRNC_AMT")
	private BigDecimal jtssPrncAmt;
	
	@Column(name="RATE_AVG")
	private BigDecimal jtssRateAvg;
	
	@Column(name="ADJUSTMENT_AMT")
	private BigDecimal jtssAdjustmentAmt;
	
	@Column(name="SOF_CODE_TARGET", length=10)
	private String jtssSofCodeTarget;
	
	@Column(name="SIMULATION_DATE")
	private Date jtssSimulationDate;
	
	@Column(name="APPROVE_STATUS", length=2)
	private String jtssApproveStatus;
	
	@Column(name="LETTER_NO", length=30)
	private String jtssLetterNo;
	
	@Column(name="CREATED_BY", length=15)
	private String jtssCreatedBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtssCreatedTimestamp;
	
	@Column(name="LASTUPDATE_BY", length=15)
	private String jtssLastupdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtssLastupdateTimestamp; 
	
	@Column(name="DISB_PLAN_DATE")
	private Date jtssDisbPlanDate;
	
	@ManyToOne
	private JfTrnSofHdrs jfTrnSofHdrs;
}
