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
@Table(name = "TR_MST_CPERSONS")
public class TrMstCpersons {

	@Id
    @Column(name = "CP_CODE", nullable = false, length = 5)
    private String tmcpCpCode;

    @Column(name = "BRANCH_ID", nullable = false)
    private Integer tmcpBranchId;

    @Column(name = "NAME_SHORT", nullable = false, length = 50)
    private String tmcpNameShort;

    @Column(name = "TITLE", length = 30)
    private String tmcpTitle;

    @Column(name = "NAME_FULL", length = 100)
    private String tmcpNameFull;

    @Column(name = "PHONE_1", length = 50)
    private String tmcpPhone1;

    @Column(name = "PHONE_2", length = 50)
    private String tmcpPhone2;

    @Column(name = "MOBILE_1", length = 50)
    private String tmcpMobile1;

    @Column(name = "RELATIONSHIP", length = 300)
    private String tmcpRelationship;

    @Column(name = "CREATED_BY", length = 15)
    private String tmcpCreatedBy;

    @Column(name = "CREATED_TIMESTAMP")
    private Date tmcpCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 15)
    private String tmcpLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    private Date tmcpLastupdateTimestamp;
}