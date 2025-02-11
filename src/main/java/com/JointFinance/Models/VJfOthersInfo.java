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
@Table(name = "V_JF_OTHERS_INFO")
public class VJfOthersInfo {

	@Id
	@Column(name="VJOI_PB_CONTRACT_NO",length=20)
	private String vjoiPbContractNo;
	
	@Column(name="VJOI_PB_LETTER_NO",length=30)
	private String vjoiPbLetterNo;
	
	@Column(name="VJOI_PB_LETTER_DATE")
	private Date vjoiPbLetterDate;
	
	@Column(name="VJOI_PB_PRNC_AMT_FIF_BY_CP")
	private BigDecimal vjoiPbPrncAmtFifByCp;
	
	@Column(name="VJOI_BUYBACK_LETTER_NO",length=30)
	private String vjoiBuybackLetterNo;
	
	@Column(name="VJOI_BUYBACK_LETTER_DATE")
	private Date vjoiBuybackLetterDate;
	
	@Column(name="VJOI_BUYBACK_OTS_PRNC_FIF")
	private BigDecimal vjoiBuybackOtsPrncFif;
	
	@Column(name="VJOI_REME_LETTER_AYD",length=25)
	private String vjoiRemeLetterAyd;
	
	@Column(name="VJOI_REME_CREATED_TIMESTAMP")
	private Date vjoiRemeCreatedTimestamp;
	
	@Column(name="VJOI_REME_RP_OUT_PRN")
	private BigDecimal vjoiRemeRpOutPrn;
	
	@Column(name="VJOI_REME_SO_LETTER",length=25)
	private String vjoiRemeSoLetter;
	
	@Column(name="VJOI_PRETERM_LETTER_NO",length=30)
	private String vjoiPretermLetterNo;
	
	@Column(name="VJOI_PRETERM_LETTER_DATE")
	private Date vjoiPretermLetterDate;
	
	@Column(name="VJOI_PRETERM_PRNC_AMT")
	private BigDecimal vjoiPretermPrncAmt;

	@Column(name="VJOI_WO150_LETTER_NO",length=30)
	private String vjoiWo150LetterNo;
	
	@Column(name="VJOI_WO150_LETTER_DATE")
	private Date vjoiWo150LetterDate;
	
	@Column(name="VJOI_WO150_OUTS_PRIN",length=2)
	private Integer vjoiWo150OutsPrin;
	
	@Column(name="VJOI_ADDENDUM_JFIN_TYPE",length=1)
	private String vjoiAddendumJfinType;
	
	@Column(name="VJOI_INST_LETTER_NO",length=30)
	private String vjoiInstLetterNo;
	
	@Column(name="VJOI_INST_LETTER_DATE")
	private Date vjoiInstLetterDate;

	@Column(name="VJOI_INSTDTLS_LETTER_NO",length=30)
	private String vjoiInstdtlsLetterNo;
	
	@Column(name="VJOI_INSTDTLS_LETTER_DATE")
	private Date vjoiInstdtlsLetterDate;
	
	@Column(name="VJOI_INSTDTLS_LNS_OTS_PRNC")
	private BigDecimal vjoiInstdtlsLnsOtsPrnc;
}
