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
@Table(name = "LOV_JTSB_BANK_PKKF")
@IdClass(LovJtsbCompBankPKKFCompkey.class)

public class LovJtsbCompBankPKKF {
	@Id
	@Column(name="BANK_NAME",length=100,  nullable = false)
	private  String lovJtsbBankPkkfName;
	
	@Id
	@Column(name="ACCOUNT_NO",length=30,  nullable = false)
	private String lovJtsbBankPkkfAccount;
	
	@Column(name="SEGMENT1",length=25)
	private String lovJtsbBankPkkfSegment;
	
	@Column(name="BRANCH_ID")
	private Integer lovJtsbBankPkkfBranch;
	
	@Column(name="BRANCH_NAME",length=50)
	private String lovJtsbBankPkkfBranchName;
	
	
	@Column(name="CP_CODE", length=5)
	private String lovJtsbBankPkkfCpCode;
   
}
