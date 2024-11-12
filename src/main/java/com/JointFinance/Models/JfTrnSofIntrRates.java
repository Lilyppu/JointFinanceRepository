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
@Table(name = "JF_TRN_SOF_INTR_RATES")
@IdClass(JfTrnSofIntrRatesCompKey.class)
public class JfTrnSofIntrRates {
	
	@Id
	@Column(name="SOF_CODE",length=10,  nullable = false)
	private String jtsirSofCode;
	
	@Id
	@Column(name="SEQ_NO")
	private Integer jtsirSeqno;
	
	@Column(name="INTR_NO")
	private Integer jtsirIntrno;
	
	@Column(name="VERSION_NO")
	private Integer jtsirVersionNo;
	
	@Column(name="PROG_ID",length=5)
	private String jtsirProgId;
	
	@Column(name="INTR_FLAG",length=3)
	private String jtsirIntrFlag;
	
	@Column(name="CONDITION",length=2)
	private String jtsirCondition;
	
	@Column(name="VALUE",length=30)
	private String jtsirValue;
	
	@Column(name="INTR_EFF")
	private BigDecimal jtsirIntrEff;
	
	@Column(name="DESCRIPTION",length=100)
	private String jtsirDescription;
	
	@Column(name="DATA_TYPE",length=1)
	private String jtsirDataType;
	
	@Column(name="PROVISI")
	private BigDecimal jtsirProvisi;
	
	@Column(name="CAP_RISK")
	private BigDecimal jtsirCapRisk;
	
	@Column(name="CREATED_BY",length=15)
	private String jtsirCreateBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtsirCreateDate;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jtsirUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtsirUpdateDate;
	
}
