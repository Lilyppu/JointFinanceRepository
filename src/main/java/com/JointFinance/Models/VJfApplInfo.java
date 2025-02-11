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
@Table(name = "V_JF_APPL_INFO")
public class VJfApplInfo {
	@Id
	@Column(name="VJAI_CONTRACT_NO",length=20)
	private String vjaiContractNo;
	
	@Column(name="VJAI_CUST_NO",length=20)
	private String vjaiCustNo;
	
	@Column(name="VJAI_KTP_CUST_NAME",length=60)
	private String vjaiKtpCustName;
	
	@Column(name="VJAI_MOTHERS_NAME",length=50)
	private String vjaiMothersName;
	
	@Column(name="VJAI_CUST_TYPE",length=1)
	private String vjaiCustType;
	
	@Column(name="VJAI_OCPT_ON_ID",length=100)
	private String vjaiOcptOnId;
	
	@Column(name="VJAI_IDENTITY_NO",length=30)
	private String vjaiIdentityNo;
	
	@Column(name="VJAI_IDENT_TYPE",length=5)
	private String vjaiIdentType;
	
	@Column(name="VJAI_BIRTH_DATE")
	private Date vjaiBirthDate;
	
	@Column(name="VJAI_BIRTH_PLACE",length=30)
	private String vjaiBirthPlace;
	
	@Column(name="VJAI_SALARY")
	private BigDecimal vjaiSalary;
	
	@Column(name="VJAI_OTHER_INCOME")
	private BigDecimal vjaiOtherIncome;
	
	@Column(name="VJAI_SPOUSE_SALARY")
	private BigDecimal vjaiSpouseSalary;
	
	@Column(name="VJAI_IDENT_DESCR",length=30)
	private String vjaiIdentDescr;
	
	@Column(name="VJAI_NPWP_NO",length=30)
	private String vjaiNpwpNo;
}
