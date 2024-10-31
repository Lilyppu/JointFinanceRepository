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
    private String tmbcBankName;
	
	@Id
    @Column(name = "ACCOUNT_NO", length = 30,nullable = false)
    private String tmbcAccountNo;

    @Column(name = "ACCOUNT_NAME", length = 100)
    private String tmbcAccountName;

    @Column(name = "CURRENCY_CODE", length = 3)
    private String tmbcCurrencyCode;

    @Column(name = "GL_ACCOUNT_NO", length = 15)
    private String tmbcGlAccountNo;

    @Column(name = "ACCOUNT_HOLDER", length = 6)
    private String tmbcAccountHolder;

    @Column(name = "BANK_BRANCH", length = 100)
    private String tmbcBankBranch;

    @Column(name = "BI_CODE", length = 240)
    private String tmbcBiCode;

    @Column(name = "STATUS_FLAG", length = 1)
    private Character tmbcStatusFlag;

    @Column(name = "BRANCH_ID")
    private Integer tmbcBranchId;

    @Column(name = "CP_CODE", length = 5)
    private String tmbcCpCode;

    @Column(name = "SEGMENT1", length = 25)
    private String tmbcSegment1;

    @Column(name = "SEGMENT2", length = 25)
    private String tmbcSegment2;

    @Column(name = "SEGMENT3", length = 25)
    private String tmbcSegment3;

    @Column(name = "SEGMENT4", length = 25)
    private String tmbcSegment4;

    @Column(name = "SEGMENT6", length = 25)
    private String tmbcSegment6;

    @Column(name = "SEGMENT7", length = 25)
    private String tmbcSegment7;

    @Column(name = "SEGMENT8", length = 25)
    private String tmbcSegment8;

    @Column(name = "APPROVED_BY", length = 15)
    private String tmbcApprovedBy;

    @Column(name = "APPROVED_TIMESTAMP")
    private Date tmbcApprovedTimestamp;

    @Column(name = "BANK_ID", length = 5)
    private String tmbcBankId;

    @Column(name = "CLASS_CODE", length = 100)
    private String tmbcClassCode;

    @Column(name = "CREATED_BY", length = 15)
    private String tmbcCreatedBy;

    @Column(name = "CREATED_TIMESTAMP")
    private Date tmbcCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 15)
    private String tmbcLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    private Date tmbcLastupdateTimestamp;

    @Column(name = "COV_ID", length = 5)
    private Integer tmbcCovId;
	}