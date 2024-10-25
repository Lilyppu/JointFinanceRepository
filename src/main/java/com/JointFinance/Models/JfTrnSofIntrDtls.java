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
@AllArgsConstructor
@Entity
@Table(name = "JF_TRN_SOF_INTR_DTLS")
@IdClass(JfTrnSofIntrDtlsCompKey.class)
public class JfTrnSofIntrDtls {
	@Id
	@Column(name="SOF_CODE",length=10,  nullable = false)
	private String jtsidSofCode;
	
	@Id
	@Column(name="SEQ_NO")
	private Integer jtsidSeqno;
	
	@Column(name="INTR_NO")
	private Integer jtsidIntrNo;
	
	@Column(name="PROG_ID",length=5)
	private String jtsidProgId;
	
	@Column(name="VERSION_NO")
	private Integer jtsidVersionNo;
	
	@Column(name="INTR_EFF")
	private BigDecimal jtsidIntrEff;
	
	@Column(name="DESCRIPTION")
	private BigDecimal jtsidDescription;
	
	@Column(name="CREATED_BY",length=15)
	private String jtsidCreateBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtsidCreateDate;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jtsidUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtsidUpdateDate;
	
}
