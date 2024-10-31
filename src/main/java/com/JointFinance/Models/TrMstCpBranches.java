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
@Table(name = "TR_MST_CP_BRANCHES")
@IdClass(TrMstCpBranchesCompKey.class)
public class TrMstCpBranches {

	@Id
	@Column(name="CP_CODE",length=5,nullable = false)
	private String tmcbCpCode;
	
	@Id
	@Column(name="BRANCH_ID",nullable = false)
	private Integer tmcbBranchId;
	
	@Column(name="BRANCH_NAME",length=50)
	private String tmcbBranch;
	
	@Column(name="ADDRESS_1",length=100)
	private String tmcbAddress1;
	
	@Column(name="ADDRESS_2",length=100)
	private String tmcbAddress2;
	
	@Column(name="ADDRESS_3",length=100)
	private String tmcbAddress3;
	
	@Column(name="LOCATION",length=100)
	private String tmcbLocation;
	
	@Column(name="CITY",length=100)
	private String tmcbCity;
	
	@Column(name="COUNTRY",length=100)
	private String tmcbCounty;
	
	@Column(name="PHONE_1",length=20)
	private String tmcbPhone1;
	
	@Column(name="PHONE_2",length=20)
	private String tmcbPhone2;
	
	@Column(name="FAX_1",length=20)
	private String tmcbFax1;
	
	@Column(name="FAX_2",length=20)
	private String tmcbFax2;
	
	@Column(name="BI_CODE",length=5)
	private String tmcbBiCode;

	@Column(name="STATUS_FLAG",length=1)
	private String tmcbStatusFlag;
	
	@Column(name="ZIP_CODE",length=7)
	private String tmcbZipCode;
	
	@Column(name="CITY_ID",length=5)
	private String tmcbCityId;
	
	@Column(name="SOURCE_TYPE",length=1)
	private Character tmcbSourceType;
	
	@Column(name="CREATED_BY",length=15)
	private String tmcbCreatedBy;

	@Column(name="CREATED_TIMESTAMP")
	private Date tmcbCreatedTimestamp;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String tmcbLastupdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date tmcbLastupdateTimestamp;
}
