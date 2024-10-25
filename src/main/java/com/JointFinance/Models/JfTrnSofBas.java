package com.JointFinance.Models;

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
@Table(name = "JF_TRN_SOF_BAS")
@IdClass(JfTrnSofBasCompKey.class)
public class JfTrnSofBas {
	@Id
	@Column(name="SOF_CODE",length=10,  nullable = false)
	private String jtsbSofCode;
		
	@Id
	@Column(name="SEQ_NO")
	private Integer jtsbSeqNo;
	
	@Id
	@Column(name="BANK_ACCT_CODE",length=4,  nullable = false)
	private String jtsbAcctNo;
	         
	@Column(name="BANK_NAME",length=100)
	private String jtsbBankName;
	
	@Column(name="ACCOUNT_NO",length=30)
	private String jtsbAccount;
	
	@Column(name="CREATED_BY",length=15)
	private String jtsbCreateBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtsbCreateDate;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jtsbLastUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtsbLastUpdateDate;  
	
	@Column(name="IS_AUTO_PAYMENT",length=1)
	private String jtsbIsAutoPay;
	


}
