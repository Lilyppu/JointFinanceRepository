package com.JointFinance.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@Table(name = "TR_MST_COUNTERPARTIES_V")
public class TrMstCounterpartiesV {

	 	@Id
	    @Column(name = "CP_CODE")
	    private String tmcvCpCode;

	    @Column(name = "CP_TYPE")
	    private String tmcvCpType;

	    @Column(name = "NAME_SHORT")
	    private String tmcvNameShort;

	    @Column(name = "NAME_FULL")
	    private String tmcvNameFull;

	    @Column(name = "STATUS_FLAG")
	    private String tmcvStatusFlag;

	    @Column(name = "CREATED_BY")
	    private String tmcvCreatedBy;

	    @Column(name = "CREATED_TIMESTAMP")
	    private Date tmcvCreatedTimestamp;

	    @Column(name = "LASTUPDATE_BY")
	    private String tmcvLastUpdatedBy;

	    @Column(name = "LASTUPDATE_TIMESTAMP")
	    private Date tmcvLastUpdatedTimestamp;

	    @Column(name = "BRANCH_ID")
	    private Integer tmcvBranchId;

	    @Column(name = "BRANCH_NAME")
	    private String tmcvBranchName;

	    @Column(name = "ADDRESS_1")
	    private String tmcvAddress1;

	    @Column(name = "ADDRESS_2")
	    private String tmcvAddress2;

	    @Column(name = "ADDRESS_3")
	    private String tmcvAddress3;

	    @Column(name = "LOCATION")
	    private String tmcvLocation;

	    @Column(name = "CITY")
	    private String tmcvCity;

	    @Column(name = "COUNTRY")
	    private String tmcvCountry;

	    @Column(name = "PHONE_1")
	    private String tmcvPhone1;

	    @Column(name = "PHONE_2")
	    private String tmcvPhone2;

	    @Column(name = "FAX_1")
	    private String tmcvFax1;

	    @Column(name = "FAX_2")
	    private String tmcvFax2;

	    @Column(name = "BI_CODE")
	    private String tmcvBiCode;

	    @Column(name = "BRANCH_STATUS_FLAG")
	    private String tmcvBranchStatusFlag;

	    @Column(name = "ZIP_CODE")
	    private String tmcvZipCode;

	    @Column(name = "CITY_ID")
	    private String tmcvCityId;

	    @Column(name = "SOURCE_TYPE")
	    private String tmcvSourceType;

	    @Column(name = "BRANCH_CREATED_BY")
	    private String tmcvBranchCreatedBy;

	    @Column(name = "BRANCH_CREATED_TIMESTAMP")
	    private Date tmcvBranchCreatedTimestamp;

	    @Column(name = "BRANCH_LASTUPDATE_BY")
	    private String tmcvBranchLastUpdatedBy;

	    @Column(name = "BRANCH_LASTUPDATE_TIMESTAMP")
	    private Date tmcvBranchLastUpdatedTimestamp;
}
