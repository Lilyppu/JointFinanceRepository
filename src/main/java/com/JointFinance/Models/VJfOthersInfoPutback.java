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
@Table(name = "V_JF_OTHERS_INFO_PUTBACK")
public class VJfOthersInfoPutback {
	
	@Id
	@Column(name="VJOI_PB_CONTRACT_NO",length=20)
	private String vjoiPbContractNo;
	
	@Column(name="VJOI_PB_LETTER_NO",length=30)
	private String vjoiPbLetterNo;
	
	@Column(name="VJOI_PB_LETTER_DATE")
	private Date vjoiPbLetterDate;
	
	@Column(name="VJOI_PB_PRNC_AMT_FIF_BY_CP")
	private BigDecimal vjoiPbPrncAmtFifByCp;
}
