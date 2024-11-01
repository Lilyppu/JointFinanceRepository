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
	private String tmcbrCpCode;
	
	@Id
	@Column(name="BRANCH_ID",nullable = false)
	private Integer tmcbrBranchId;
	
	@Column(name="BRANCH_NAME",length=50)
	private String tmcbrBranch;
	
	@Column(name="ADDRESS_1",length=100)
	private String tmcbrAddress1;
	
	@Column(name="ADDRESS_2",length=100)
	private String tmcbrAddress2;
	
	@Column(name="ADDRESS_3",length=100)
	private String tmcbrAddress3;
	
	@Column(name="LOCATION",length=100)
	private String tmcbrLocation;
	
	@Column(name="CITY",length=100)
	private String tmcbrCity;
	
	@Column(name="COUNTRY",length=100)
	private String tmcbrCounty;
	
	@Column(name="PHONE_1",length=20)
	private String tmcbrPhone1;
	
	@Column(name="PHONE_2",length=20)
	private String tmcbrPhone2;
	
	@Column(name="FAX_1",length=20)
	private String tmcbrFax1;
	
	@Column(name="FAX_2",length=20)
	private String tmcbrFax2;
	
	@Column(name="BI_CODE",length=5)
	private String tmcbrBiCode;

	@Column(name="STATUS_FLAG",length=1)
	private String tmcbrStatusFlag;
	
	@Column(name="ZIP_CODE",length=7)
	private String tmcbrZipCode;
	
	@Column(name="CITY_ID",length=5)
	private String tmcbrCityId;
	
	@Column(name="SOURCE_TYPE",length=1)
	private Character tmcbrSourceType;
	
	@Column(name="CREATED_BY",length=15)
	private String tmcbrCreatedBy;

	@Column(name="CREATED_TIMESTAMP")
	private Date tmcbrCreatedTimestamp;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String tmcbrLastupdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date tmcbrLastupdateTimestamp;
}
