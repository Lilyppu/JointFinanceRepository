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
@Table(name = "JF_TRN_SOF_CPS")
@IdClass(JFTrnSofCpsCompKey.class)
public class JFTrnSofCps {
	
	@Id
	@Column(name="SOF_CODE",length=10,  nullable = false)
	private String jtscSofCode;
	
	@Id
	@Column(name="SEQ_NO")
	private Integer jtscSeqno;
	
	@Column(name="CP_CODE",length=5)
	private String JtscCpCode;
	
	@Column(name="BRANCH_ID")
	private Integer JtscBranchId;
	
	@Column(name="SEGMENT5", length=25)
	private String JtscSegment;
	
	@Column(name="ALIASES", length=10)
	private String JtscAliases;
	
	@Column(name="CREDITUR_TYPE", length=4)
	private String JtscCrediturType;
	
	@Column(name="CREDITUR_NAME", length=50)
	private String JtscCrediturName;
	
	@Column(name="CREDITUR_ADDR", length=100)
	private String JtscCrediturAddr;
	
	@Column(name="CREDITUR_CITY", length=25)
	private String JtscCrediturCity;
	
	@Column(name="CONTACT_PERSON", length=25)
	private String JtscContactperson;
	
	@Column(name="PERSON_GENDER", length=2)
	private String JtscPersonGender;
	
	@Column(name="CPERSON_EMAIL", length=100)
	private String JtscPersonEmail;
	
	@Column(name="SOFTCOPY_EMAIL", length=100)
	private String JtscSoftCopyEmail;

	@Column(name="CREATED_BY",length=15)
	private String jtscCreateBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtshCreateDate;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jtscLastUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtscLastUpdateDate;   
	
}
