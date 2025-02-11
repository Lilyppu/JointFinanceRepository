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
@Table(name = "V_JF_OTHERS_INFO_PRETERM")
public class VJfOthersInfoPreterm {
	@Id
	@Column(name="VJOI_PB_CONTRACT_NO",length=20)
	private String vjoiPretermContractNo;
	
	@Column(name="VJOI_PRETERM_LETTER_NO",length=30)
	private String vjoiPretermLetterNo;
	
	@Column(name="VJOI_PRETERM_LETTER_DATE")
	private Date vjoiPretermLetterDate;
	
	@Column(name="VJOI_PRETERM_PRNC_AMT")
	private BigDecimal vjoiPretermPrncAmt;
}
