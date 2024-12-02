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
@IdClass(ViewJtlJfTrnSumContractsCompKey.class)
public class ViewJtlJfTrnSumContracts {
	
	@Id
	@Column(name="SOF_CODE",length=10, nullable = false)
	private String ViewJtlJtscSofCode;
	
	@Id
	@Column(name="CONTRACT_NO",length=20, nullable = false)
	private String ViewJtlJtscContractNo;
	
	@Column(name="INST_NO")
	private Integer ViewJtlJtscInstNo;
	
	@Column(name="KTP_CUST_NAME",length=60)
	private String ViewJtlJtscKtpCustName;
	
	@Column(name="CONTRACT_STATUS",length=2)
	private String ViewJtlJtscContractStatus;
	
	@Column(name="LETTER_NO",length=35)
	private String ViewJtlJtscLetterNo;
	
	@Column(name="PV_LETTER_NO",length=35)
	private String ViewJtlJtscPvLetterNo;
	
	@Column(name="PRNC_AMOUNT")
	private Integer ViewJtlJtscPrncAmount;
	
	@Column(name="INTR_AMOUNT")
	private Integer ViewJtlJtscIntrAmount;
	
	@Column(name="INSTALLMENT")
	private Integer ViewJtlJtscInstallment;

}
