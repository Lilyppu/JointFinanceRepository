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
@Table(name = "V_JF_OTHERS_INFO_BUYBACK")
public class VJfOthersInfoBuyback {
	
	@Id
	@Column(name="VJOI_BUYBACK_CONTRACT_NO",length=20)
	private String vjoiBuybackContractNo;
	
	@Column(name="VJOI_BUYBACK_LETTER_NO",length=30)
	private String vjoiBuybackLetterNo;
	
	@Column(name="VJOI_BUYBACK_LETTER_DATE")
	private Date vjoiBuybackLetterDate;
	
	@Column(name="VJOI_BUYBACK_OTS_PRNC_FIF")
	private BigDecimal vjoiBuybackOtsPrncFif;
}
