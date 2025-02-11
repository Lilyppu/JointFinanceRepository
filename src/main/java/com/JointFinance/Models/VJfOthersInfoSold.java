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
@Table(name = "V_JF_OTHERS_INFO_SOLD")

public class VJfOthersInfoSold {
	@Id
	@Column(name="VJOI_SOLD_CONTRACT_NO",length=20)
	private String vjoiSoldContractNo;
	
	@Column(name="VJOI_SOLD_SO_LETTER",length=25)
	private String vjoiSoldSoLetter;
	
	@Column(name="VJOI_SOLD_CREATED_TIMESTAMP")
	private Date vjoiSoldCreatedTimestamp;
	
	@Column(name="VJOI_SOLD_RP_OUT_PRN")
	private BigDecimal vjoiSoldRpOutPrn;
}
