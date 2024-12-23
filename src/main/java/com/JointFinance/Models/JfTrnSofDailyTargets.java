package com.JointFinance.Models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

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
@Table(name = "JF_TRN_SOF_DAILY_TARGETS")
@IdClass(JfTrnSofDailyTargetsCompKey.class)
public class JfTrnSofDailyTargets implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SOF_CODE", length=10, nullable = false)
	private String jtsdtSofCode;
	
	@Id
	@Column(name="TARGET_DATE", nullable = false)
	private Date jtsdtTargetDate;
	
	@Column(name="TARGET_AMT")
	private BigDecimal jtsdtTargetAmt;
	
	@Column(name="USED_AMT")
	private BigDecimal jtsdtUsedAmt;
	
	@Column(name="BOOKED_AMT")
	private BigDecimal jtsdtBookedAmt;
	
	@Column(name="CREATED_BY", length=15)
	private String jtsdtCreatedBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtsdtCreatedTimestamp;
	
	@Column(name="LASTUPDATE_BY", length=15)
	private String jtsdtLastupdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtsdtLastupdateTimestamp;
}
