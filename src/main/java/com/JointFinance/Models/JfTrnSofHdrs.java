package com.JointFinance.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "JF_TRN_SOF_HDRS")
public class JfTrnSofHdrs {
	
	@Id
	@Column(name="JTSH_SOF_CODE",length=10,  nullable = false)
	private String jtshSofCode;
	
	@Column(name="JTSH_DESCRIPTION",length=100)
	private String jtshDescription;
	
	@Column(name="JTSH_ALIASES",length=10)
	private String jtshAlias;
	
	@Column(name="JTSH_START_DATE")
	private String jtshStartDate;
	
	@Column(name="JTSH_END_DATE")
	private String jtshENDDate;
	
	@Column(name="JTSH_AGREEMENT_NO",length=20)
	private String jtshAggrementNo;
	
	@Column(name="JTSH_AGREEMENT_DATE")
	private String jtshAggrementDate;
	
	@Column(name="JTSH_CONTACT_PERSON",length=25)
	private String jtshContactPerson;
	
	@Column(name="JTSH_PERSON_GENDER",length=1)
	private String jtshPersonGender;
	
	@Column(name="JTSH_CREDITUR_TYPE",length=4)
	private String jtshCrediturType;
	
	@Column(name="JTSH_CREDITUR_NAME",length=50)
	private String jtshCrediturName;
	
	@Column(name="JTSH_CREDITUR_ADDR",length=100)
	private String jtshCrediturAddr;
	
	@Column(name="JTSH_CREDITUR_CITY",length=25)
	private String jtshCrediturCity;
	
	@Column(name="JTSH_JF_TYPE",length=25)
	private String jtshJfType;
	
	@Column(name="JTSH_JF_MODEL",length=2)
	private String jtshJfModel;
	
	@Column(name="JTSH_JF_STATUS",length=2)
	private String jtshJfStatus;
	
	@Column(name="JTSH_NUMBER_CP")
	private Integer jtshNumberCp;
	
	@Column(name="JTSH_SYARIAH_DEFAULT",length=1)
	private String jtshSyariahDefault;
	
	@Column(name="JTSH_COY_ID",length=5)
	private String jtshCoyId;
	
	@Column(name="JTSH_PRIORITY")
	private Integer jtshPriority;
	
	@Column(name="JTSH_COY_PORTION")
	private BigDecimal jtshCoyPortion;
	
	@Column(name="JTSH_TARGET_AMT")
	private BigDecimal jtshTargetAmt;
	
	@Column(name="JTSH_USED_AMT")
	private BigDecimal jtshUsedAmt;
	
	@Column(name="JTSH_PAID_AMT")
	private BigDecimal jtshPaidAmt;
	
	@Column(name="JTSH_IS_REVOLVING",length=1)
	private String jtshIsRevolving;
	
	@Column(name="JTSH_PLATFORM",length=2)
	private String jtshPlatform;
	
	@Column(name="JTSH_PROCESS_GROUP")
	private Integer jtshProcessGroup;
	
	@Column(name="JTSH_IGNORE_PLAFOND",length=1)
	private String jtshIgnorePlafond;
	
	@Column(name="JTSH_CREATED_BY",length=15)
	private String jtshCreateBy;
	
	@Column(name="JTSH_CREATED_TIMESTAMP")
	private Date jtshCreateDate;
	
	@Column(name="JTSH_LASTUPDATE_BY",length=15)
	private String jtshLastUpdateBy;
	
	@Column(name="JTSH_LASTUPDATE_TIMESTAMP")
	private Date jtshLastUpdateDate;    
	       

}
