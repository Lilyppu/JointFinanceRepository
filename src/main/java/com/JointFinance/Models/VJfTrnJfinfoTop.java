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
@Table(name = "V_JF_TRN_JFINFO_TOP")
//@IdClass(LovJtclContractCompkey.class)
public class VJfTrnJfinfoTop {
	@Id
	@Column(name="VJTJT_CONTRACT_NO",length=20)
	private String vjtjtContractNo;
	
	@Column(name="VJTJT_CONTRACT_STATUS",length=2)
	private String vjtjtContractStatus;
	
	@Column(name="VJTJT_CUST_NAME",length=60)
	private String vjtjtCustName;
	
	@Column(name="VJTJT_SOF_CODE",length=10)
	private String vjtjtSofCode;
	
	@Column(name="VJTJT_SEQ_NO")
	private Integer vjtjtSeqNo;
	
	@Column(name="VJTJT_PCT_PORTION")
	private BigDecimal vjtjtPctPortion;
	
	@Column(name="VJTJT_INTR_RATE_EFF")
	private BigDecimal vjtjtIntrRateEff;
	
	@Column(name="VJTJT_INTR_RATE_FLAT")
	private BigDecimal vjtjtIntrRateFlat;
	
	@Column(name="VJTJT_DPD")
	private Integer vjtjtDpd;
	
	@Column(name="VJTJT_JFIN_TYPE",length=1)
	private String vjtjtJfrinType;
	
	@Column(name="VJTJT_NAME_SHORT",length=50)
	private String vjtjtNameShort;
	
	@Column(name="VJTJT_DESCRIPTION",length=100)
	private String vjtjtDescription;
	
	@Column(name="VJTJT_ALIASES",length=10)
	private String vjtjtAliases;

	@Column(name="VJTJT_PCT_EFF")
	private BigDecimal vjtjtPctEff;
	
	@Column(name="VJTJT_PCT_FLAT")
	private BigDecimal vjtjtPctFlat;
}
