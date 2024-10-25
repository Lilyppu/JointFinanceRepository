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
	@Column(name="SOF_CODE",length=10,  nullable = false)
	private String jtshSofCode;
	
	@Column(name="DESCRIPTION",length=100)
	private String jtshDescription;
	
	@Column(name="ALIASES",length=10)
	private String jtshAlias;
	
	@Column(name="START_DATE")
	private Date jtshStartDate;
	
	@Column(name="END_DATE")
	private Date jtshENDDate;
	
	@Column(name="AGREEMENT_NO",length=20)
	private String jtshAggrementNo;
	
	@Column(name="AGREEMENT_DATE")
	private String jtshAggrementDate;
	
	@Column(name="CONTACT_PERSON",length=25)
	private String jtshContactPerson;
	
	@Column(name="PERSON_GENDER",length=1)
	private String jtshPersonGender;
	
	@Column(name="CREDITUR_TYPE",length=4)
	private String jtshCrediturType;
	
	@Column(name="CREDITUR_NAME",length=50)
	private String jtshCrediturName;
	
	@Column(name="CREDITUR_ADDR",length=100)
	private String jtshCrediturAddr;
	
	@Column(name="CREDITUR_CITY",length=25)
	private String jtshCrediturCity;
	
	@Column(name="JF_TYPE",length=25)
	private String jtshJfType;
	
	@Column(name="JF_MODEL",length=2)
	private String jtshJfModel;
	
	@Column(name="JF_STATUS",length=2)
	private String jtshJfStatus;
	
	@Column(name="NUMBER_CP")
	private Integer jtshNumberCp;
	
	@Column(name="SYARIAH_DEFAULT",length=1)
	private String jtshSyariahDefault;
	
	@Column(name="COY_ID",length=5)
	private String jtshCoyId;
	
	@Column(name="PRIORITY")
	private Integer jtshPriority;
	
	@Column(name="COY_PORTION")
	private BigDecimal jtshCoyPortion;
	
	@Column(name="TARGET_AMT")
	private BigDecimal jtshTargetAmt;
	
	@Column(name="USED_AMT")
	private BigDecimal jtshUsedAmt;
	
	@Column(name="PAID_AMT")
	private BigDecimal jtshPaidAmt;
	
	@Column(name="IS_REVOLVING",length=1)
	private String jtshIsRevolving;
	
	@Column(name="PLATFORM",length=2)
	private String jtshPlatform;
	
	@Column(name="PROCESS_GROUP")
	private Integer jtshProcessGroup;
	
	@Column(name="IGNORE_PLAFOND",length=1)
	private String jtshIgnorePlafond;
	
	@Column(name="CREATED_BY",length=15)
	private String jtshCreateBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtshCreateDate;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jtshLastUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtshLastUpdateDate;    
	       

}
