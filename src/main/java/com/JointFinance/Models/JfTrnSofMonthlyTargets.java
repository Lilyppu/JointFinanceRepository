package com.JointFinance.Models;

import java.io.Serializable;
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
@Table(name = "JF_TRN_SOF_MONTHLY_TARGETS")
@IdClass(JfTrnSofMonthlyTargetsCompKey.class)
public class JfTrnSofMonthlyTargets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="SOF_CODE", length=10, nullable = false)
	private String jtsmtSofCode;
	
	@Id
	@Column(name="TARGET_YEAR", nullable = false)
	private Integer jtsmtTargetYear;
	
	@Id
	@Column(name="TARGET_MONTH", nullable = false)
	private Integer jtsmtTargetMonth;
	
	@Column(name="TARGET_AMT")
	private BigDecimal jtsmtTargetAmt;
	
	@Column(name="USED_AMT")
	private BigDecimal jtsmtUsedAmt;
	
	@Column(name="BOOKED_AMT")
	private BigDecimal jtsmtBookedAmt;
	
	@Column(name="CREATED_BY", length=15)
	private String jtsmtCreatedBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtsmtCreatedTimestamp;
	
	@Column(name="LASTUPDATE_BY", length=15)
	private String jtsmtLastupdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtsmtLastupdateTimestamp;
}
