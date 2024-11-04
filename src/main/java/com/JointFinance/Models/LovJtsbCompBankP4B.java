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
@Table(name = "LOV_JTSB_BANK_P4B")
@IdClass(LovJtsbCompBankP4BCompkey.class)
public class LovJtsbCompBankP4B {
	
	@Id
	@Column(name="BANK_NAME",length=100,  nullable = false)
	private  String lovJtsbBankName;
	
	@Id
	@Column(name="ACCOUNT_NO",length=30,  nullable = false)
	private String lovJtsbBankAccount;
	
	@Column(name="SEGMENT1",length=25)
	private String lovJtsbBankSegment;
	
	@Column(name="BRANCH_ID")
	private Integer lovJtsbBankBranch;
	
	@Column(name="BRANCH_NAME",length=50)
	private String lovJtsbBankBranchName;
	
	@Column(name="ACCOUNT_HOLDER", length=6)
	private String lovJtsbAccHolder;
	
	@Column(name="CP_CODE", length=5)
	private String lovJtsbCpCode;
		   

}
