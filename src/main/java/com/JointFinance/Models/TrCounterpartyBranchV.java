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
@Table(name = "TR_COUNTERPARTY_BRANCH_V")
public class TrCounterpartyBranchV {
	 	@Id
	    @Column(name = "CP_CODE")
	    private String tcbvCpCode;

	    @Column(name = "NAME_FULL")
	    private String tcbvNameFull;

	    @Column(name = "NAME_SHORT")
	    private String tcbvNameShort;

	    @Column(name = "CP_TYPE")
	    private String tcbvCpType;

	    @Column(name = "BRANCH_ID")
	    private int tcbvBranchId;

	    @Column(name = "BRANCH_NAME")
	    private String tcbvBranchName;

	    @Column(name = "ADDRESS_1")
	    private String tcbvAddress1;

	    @Column(name = "ADDRESS_2")
	    private String tcbvAddress2;

	    @Column(name = "ADDRESS_3")
	    private String tcbvAddress3;

	    @Column(name = "LOCATION")
	    private String tcbvLocation;

	    @Column(name = "CITY")
	    private String tcbvCity;

	    @Column(name = "COUNTRY")
	    private String tcbvCountry;

	    @Column(name = "PHONE_1")
	    private String tcbvPhone1;

	    @Column(name = "PHONE_2")
	    private String tcbvPhone2;

	    @Column(name = "FAX_1")
	    private String tcbvFax1;

	    @Column(name = "FAX_2")
	    private String tcbvFax2;

	    @Column(name = "BI_CODE")
	    private String tcbvBiCode;

	    @Column(name = "ZIP_CODE")
	    private String tcbvZipCode;

	    @Column(name = "SOURCE_TYPE")
	    private char tcbvSourceType;

	    @Column(name = "ROLE_CODE")
	    private String tcbvRoleCode;

	    @Column(name = "ROLE_CURRENCY_CODE")
	    private String tcbvRoleCurrencyCode;

	    @Column(name = "TRANSACTION_LIMIT")
	    private long tcbvTransactionLimit;

	    @Column(name = "OUTSTANDING_LIMIT")
	    private long tcbvOutstandingLimit;
}
