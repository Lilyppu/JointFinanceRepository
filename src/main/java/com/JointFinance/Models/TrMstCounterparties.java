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
@Table(name = "TR_MST_COUNTERPARTIES")
public class TrMstCounterparties {

	@Id
	@Column(name="CP_CODE",length=5,nullable = false)
	private String tmcCpCode;
	
	@Column(name="CP_TYPE",length=8,nullable = false)
	private String tmcCpType;
	
	@Column(name="NAME_SHORT",length=50)
	private String tmcNameShort;
	
	@Column(name="NAME_FULL", length=100)
	private String tmcNameFull;
	
	@Column(name="STATUS_FLAG", length=1,nullable = false)
	private String tmcStatusFlag;
	
	@Column(name="CREATED_BY", length=15)
	private String tmcCreatedBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date tmcCreatedTimestamp;
	
	@Column(name="LASTUPDATE_BY", length=15)
	private String tmcLastupdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date tmcLastupdateTimestamp;
}
