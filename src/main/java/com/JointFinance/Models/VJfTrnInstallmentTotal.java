package com.JointFinance.Models;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "V_JF_TRN_INSTALLMENTS_TOTAL")

public class VJfTrnInstallmentTotal {
	
	@Id
	@Column(name="VJTIT_CONTRACT_NO",length=20)
	private String vjtitContractNo;
	
	@Column(name="VJTIT_TOT_PRNC_AMT")
	private BigDecimal vjtitTotPrncAmt;
	
	@Column(name="VJTIT_TOT_PRNC_AMT_PAID")
	private BigDecimal vjtitTotPrncAmtPaid;
	
	@Column(name="VJTIT_TOT_INTR_AMT")
	private BigDecimal vjtitTotIntrAmt;
	
	@Column(name="VJTIT_TOT_INTR_AMT_PAID")
	private BigDecimal vjtitTotIntrAmtPaid;
	
	@Column(name="VJTIT_TOT_PENALTY_AMT")
	private BigDecimal vjtitTotPenaltyAmt;
}
