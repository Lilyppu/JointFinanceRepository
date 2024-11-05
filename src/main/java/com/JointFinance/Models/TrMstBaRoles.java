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
@Table(name = "TR_MST_BA_ROLES")
@IdClass(TrMstBaRolesCompKey.class)
public class TrMstBaRoles {

	@Id
    @Column(name = "BANK_NAME", length = 100,  nullable = false)
    private String tmbrBankName;

    @Id
    @Column(name = "ACCOUNT_NO", length = 30,  nullable = false)
    private String tmbrAccountNo;

    @Id
    @Column(name = "CP_CODE", length = 5,  nullable = false)
    private String tmbrCpCode;

    @Id
    @Column(name = "BRANCH_ID",  nullable = false)
    private Integer tmbrBranchId;

    @Id
    @Column(name = "ROLE_CODE", length = 5,  nullable = false)
    private String tmbrRoleCode;

    @Column(name = "STATUS_FLAG", length = 1)
    private String tmbrStatusFlag;

    @Column(name = "CREATED_BY", length = 15)
    private String tmbrCreatedBy;

    @Column(name = "CREATED_TIMESTAMP")
    private Date tmbrCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 15)
    private String tmbrLastUpdatedBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    private Date tmbrLastUpdatedTimestamp;
    
    @Column(name = "LASTUPDATEBY", length = 15)
    private String tmbrLastUpdatedBy2;
}
