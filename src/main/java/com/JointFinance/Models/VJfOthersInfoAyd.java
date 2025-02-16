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
@Table(name = "V_JF_OTHERS_INFO_AYD")
public class VJfOthersInfoAyd {
	@Id
	@Column(name="VJOI_AYD_CONTRACT_NO",length=20)
	private String vjoiAydContractNo;
	
	@Column(name="VJOI_AYD_LETTER_AYD",length=25)
	private String vjoiAydLetterAyd;
	
	@Column(name="VJOI_AYD_CREATED_TIMESTAMP")
	private Date vjoiAydCreatedTimestamp;
	
	@Column(name="VJOI_AYD_RP_OUT_PRN")
	private BigDecimal vjoiAydRpOutPrn;
}
