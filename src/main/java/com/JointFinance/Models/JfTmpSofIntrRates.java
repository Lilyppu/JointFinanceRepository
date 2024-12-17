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
@Table(name = "JF_TMP_SOF_INTR_RATES")

public class JfTmpSofIntrRates {

	@Id
    @Column(name = "SOF_CODE", length = 10)
    private String jtmsirSofCode;

	@Id
    @Column(name = "SEQ_NO")
    private Integer jtmsirSeqNo;

    @Column(name = "INTR_NO")
    private Integer jtmsirIntrNo;

    @Column(name = "PROG_ID", length = 5)
    private String jtmsirProgId;

    @Column(name = "VERSION_NO")
    private Integer jtmsirVersionNo;

    @Column(name = "INTR_EFF")
    private Integer jtmsirIntrEff;

    @Column(name = "DESCRIPTION", length = 100)
    private String jtmsirDescription;

    @Column(name = "PROVISI")
    private Integer jtmsirProvisi;

    @Column(name = "CAP_RISK")
    private Integer jtmsirCapRisk;

    @Column(name = "STATUS_OPR", length = 2)
    private String jtmsirStatusOpr;

    @Column(name = "STATUS_APPROVED", length = 2)
    private String jtmsirStatusApproved;

    @Column(name = "NEW_PROG_ID", length = 5)
    private String jtmsirNewProgId;

    @Column(name = "CREATED_BY", length = 15)
    private String jtmsirCreatedBy;

    @Column(name = "CREATED_TIMESTAMP")
    private Date jtmsirCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 15)
    private String jtmsirLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    private Date jtmsirLastupdateTimestamp;
	
}
