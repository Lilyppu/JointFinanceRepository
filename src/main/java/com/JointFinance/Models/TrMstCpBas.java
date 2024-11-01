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
@Table(name = "TR_MST_CP_BAS")
@IdClass(TrMstCpBasCompKey.class)
public class TrMstCpBas {
	 
	@Id
    @Column(name = "BANK_NAME", length = 100,nullable = false)
    private String tmcbBankName;
	
	@Id
    @Column(name = "ACCOUNT_NO", length = 30,nullable = false)
    private String tmcbAccountNo;

    @Column(name = "ACCOUNT_NAME", length = 100)
    private String tmcbAccountName;

    @Column(name = "CURRENCY_CODE", length = 3)
    private String tmcbCurrencyCode;

    @Column(name = "GL_ACCOUNT_NO", length = 15)
    private String tmcbGlAccountNo;

    @Column(name = "ACCOUNT_HOLDER", length = 6)
    private String tmcbAccountHolder;

    @Column(name = "BANK_BRANCH", length = 100)
    private String tmcbBankBranch;

    @Column(name = "BI_CODE", length = 240)
    private String tmcbBiCode;

    @Column(name = "STATUS_FLAG", length = 1)
    private Character tmcbStatusFlag;

    @Column(name = "BRANCH_ID")
    private Integer tmcbBranchId;

    @Column(name = "CP_CODE", length = 5)
    private String tmcbCpCode;

    @Column(name = "SEGMENT1", length = 25)
    private String tmcbSegment1;

    @Column(name = "SEGMENT2", length = 25)
    private String tmcbSegment2;

    @Column(name = "SEGMENT3", length = 25)
    private String tmcbSegment3;

    @Column(name = "SEGMENT4", length = 25)
    private String tmcbSegment4;

    @Column(name = "SEGMENT6", length = 25)
    private String tmcbSegment6;

    @Column(name = "SEGMENT7", length = 25)
    private String tmcbSegment7;

    @Column(name = "SEGMENT8", length = 25)
    private String tmcbSegment8;

    @Column(name = "APPROVED_BY", length = 15)
    private String tmcbApprovedBy;

    @Column(name = "APPROVED_TIMESTAMP")
    private Date tmcbApprovedTimestamp;

    @Column(name = "BANK_ID", length = 5)
    private String tmcbBankId;

    @Column(name = "CLASS_CODE", length = 100)
    private String tmcbClassCode;

    @Column(name = "CREATED_BY", length = 15)
    private String tmcbCreatedBy;

    @Column(name = "CREATED_TIMESTAMP")
    private Date tmcbCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 15)
    private String tmcbLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    private Date tmcbLastupdateTimestamp;

    @Column(name = "COV_ID", length = 5)
    private Integer tmcbCovId;
	}