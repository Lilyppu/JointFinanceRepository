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
@Table(name = "JF_TRN_MEMO_HDRS")
public class JfTrnMemoHdrs {
	
	@Id
	@Column(name="MEMO_NO",length=30,  nullable = false)
	private String jtmhMemoNo;
	
	@Column(name="MEMO_DATE")
	private Date jtmhMemoDate;
	
	@Column(name="SOF_CODE",length=10)
	private String jtmhSofCode;
	
	@Column(name="SEQ_NO")
	private Integer jtmhSeqNo;
	
	@Column(name="LETTER_NO",length=30)
	private String jtmhLetterNo;
	
	@Column(name="LETTER_DATE")
	private Date jtmhLetterDate;
	
	@Column(name="MEMO_TYPE",length=2)
	private String jtmhMemoType;
	
	@Column(name="REFF_LETTER_NO",length=30)
	private String jtmhReffLetterNo;
	
	@Column(name="REFF_LETTER_DATE")
	private Date jtmhReffLetterDate;
	
	@Column(name="REMARKS",length=100)
	private String jtmhRemarks;
	
	@Column(name="MEMO_STATUS",length=2)
	private String jtmhMemoStatus;
	
	@Column(name="CREATED_BY",length=15)
	private String jtmhCreateBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtmhCreateDate;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jtmhUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtmhUpdateDate;

}
