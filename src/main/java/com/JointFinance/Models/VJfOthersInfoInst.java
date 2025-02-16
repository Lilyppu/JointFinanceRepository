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
@Table(name = "V_JF_OTHERS_INFO_INST")
public class VJfOthersInfoInst {
	
	@Id
	@Column(name="VJOI_INST_CONTRACT_NO",length=20)
	private String vjoiInstContractNo;
	
	@Column(name="VJOI_INST_JFIN_TYPE",length=1)
	private String vjoiInstJfinType;
	
	@Column(name="VJOI_INST_LETTER_NO",length=30)
	private String vjoiInstLetterNo;
	
	@Column(name="VJOI_INST_LETTER_DATE")
	private Date vjoiInstLetterDate;

	@Column(name="VJOI_INST_LETTER_NO_DTLS",length=30)
	private String vjoiInstLetterNoDtls;
	
	@Column(name="VJOI_INST_LETTER_DATE_DTLS")
	private Date vjoiInstLetterDateDtls;
	
	@Column(name="VJOI_INST_LNS_OTS_PRNC")
	private BigDecimal vjoiInstLnsOtsPrnc;
}
