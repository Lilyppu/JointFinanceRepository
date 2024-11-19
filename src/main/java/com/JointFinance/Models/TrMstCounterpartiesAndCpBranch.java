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
@IdClass(TrMstCounterpartiesAndCpBranchCompKey.class)
public class TrMstCounterpartiesAndCpBranch {
	
	@Id
    @Column(name = "CP_CODE")
    private String tmcAndCbrCpCode;

    @Column(name = "CP_TYPE")
    private String tmcAndCbrCpType;

    @Column(name = "NAME_SHORT")
    private String tmcAndCbrNameShort;

    @Id
    @Column(name = "BRANCH_ID")
    private Integer tmcAndCbrBranchId;

    @Column(name = "BRANCH_NAME")
    private String tmcAndCbrBranchName;
    
    @Column(name = "ACCOUNT_NO")
    private String tmcAndCbrAccountNo;
}
