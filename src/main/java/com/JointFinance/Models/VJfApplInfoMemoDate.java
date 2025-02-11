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
@Table(name = "V_JF_APPL_INFO_MEMO_DATE")
public class VJfApplInfoMemoDate {
	
	@Id
	@Column(name="VJAIMD_CONTRACT_NO",length=20)
	private String vjaimdContractNo;
	
	@Column(name="VJAIMD_MEMO_DATE")
	private Date vjaimdMemoDate;
	
}
