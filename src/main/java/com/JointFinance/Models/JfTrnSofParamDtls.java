package com.JointFinance.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "JF_TRN_SOF_PARAM_DTLS")
@IdClass(JfTrnSofParamDtlsCompKey.class)
public class JfTrnSofParamDtls {
	
	@Id
	@Column(name="SOF_CODE",length=10,  nullable = false)
	private String jtspdSofCode;
	
	@Id
	@Column(name="SEQ_VER")
	private Integer jtspdVer;
	
	@Id
	@Column(name="SEQ_NO")
	private Integer jtspdSeqNo;
	
	@Id
	@Column(name="OFFICE_CODE",length=5)
	private String jtspdOfficeCode;
	
	@Column(name="OPR_SIGN",length=30)
	private String jtspdOprSign;
	
	@Column(name="PARAM_VALUE",length=30)
	private String jtspdParamValue;

	@Column(name="CREATED_BY",length=15)
	private String jtspdCreateBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtspdCreateDate;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jtspdLastUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtspdLastUpdateDate;  

}
