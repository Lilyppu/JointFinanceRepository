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
@Table(name = "V_JF_OTHERS_INFO_WO150")
public class VJfOthersInfoWo150 {
	@Id
	@Column(name="VJOI_WO150_CONTRACT_NO",length=20)
	private String vjoiWo150ContractNo;
	
	@Column(name="VJOI_WO150_LETTER_NO",length=30)
	private String vjoiWo150LetterNo;
	
	@Column(name="VJOI_WO150_LETTER_DATE")
	private Date vjoiWo150LetterDate;
	
	@Column(name="VJOI_WO150_OUTS_PRIN",length=2)
	private Integer vjoiWo150OutsPrin;
}
