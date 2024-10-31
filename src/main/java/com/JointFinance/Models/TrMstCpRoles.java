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
@Table(name = "TR_MST_CP_ROLES")
@IdClass(TrMstCpRolesCompKey.class)
public class TrMstCpRoles {

	@Id
    @Column(name = "CP_CODE",length=5,nullable = false)
    private String tmcrCpCode;

	@Id
    @Column(name = "BRANCH_ID",nullable = false)
    private Integer tmcrBranchId;

	@Id
    @Column(name = "ROLE_CODE",length=5,nullable = false)
    private String tmcrRoleCode;

    @Column(name = "CURRENCY_CODE",length=3)
    private String tmcrCurrencyCode;

    @Column(name = "TRANSACTION_LIMIT")
    private BigDecimal tmcrTransactionLimit;

    @Column(name = "STATUS_FLAG",length=1)
    private String tmcrStatusFlag;

    @Column(name = "CREATED_BY",length=15)
    private String tmcrCreatedBy;

    @Column(name = "CREATED_TIMESTAMP")
    private Date tmcrCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY",length=15)
    private String tmcrLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    private Date tmcrLastupdateTimestamp;

    @Column(name = "OUTSTANDING_LIMIT")
    private BigDecimal tmcrOutstandingLimit;
}
