package com.JointFinance.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name = "JF_TRN_LETTERS")
public class JfTrnLetters {
	
	@Id
	@Column(name="LETTER_NO",length=30,  nullable = false)
	private String jtlLetterNo;
	
	@Column(name="SOF_CODE",length=10)
	private String jtlSofCode;	
	
	@Column(name="SEQ_NO")
	private Integer jtlSeqNo;
	
	@Column(name="LETTER_TYPE",length=4)
	private String jtlLetterType;	
	
	@Column(name="LETTER_COUNT")
	private Integer jtlLetterCount;	
	
	@Column(name="REFF_NO",length=30)
	private String jtlReffNo;	
	
	@Column(name="TRANS_DATE")
	private Date jtlTransDate;
	
	@Column(name="CONFIRM_BY",length=15)
	private String jtlConfirmBy;
	
	@Column(name="CONFIRM_DATE")
	private Date jtlConfirmDate;
	
	@Column(name="PERHIT_BANK")
	private Integer jtlPerhitBank;	
	
	@Column(name="LETTER_STATUS",length=2)
	private String jtlLetterStatus;
	
	@Column(name="IS_NEWLETTER",length=1)
	private String jtlIsNewletter;
	
	@Column(name="PERHIT_FIF")
	private Integer jtlPerhitFif;	
	
	@Column(name="LETTER_DATE")
	private Date jtlLetterDate;
	
	@Column(name="TRANS_DATE_END")
	private Date jtlTransDateEnd;
			
	@Column(name="CREATED_BY",length=15)
	private String jtlCreateBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtlCreateDate;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jtlUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtlUpdateDate;
	
	@Column(name="GROUP_CODE",length=30)
	private String jtlGroupCode;	

}
