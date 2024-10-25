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
@Table(name = "JF_TRN_SOF_PARAMETERS")
@IdClass(JfTrnSofParametersCompKey.class)
public class JfTrnSofParameters {
	  
	@Id
	@Column(name="SOF_CODE",length=10,  nullable = false)
	private String jtspSofCode;
	
	@Id
	@Column(name="SEQ_VER")
	private Integer jtspVer;
	
	@Id
	@Column(name="SEQ_NO")
	private Integer jtspSeqNo;
	
	@Column(name="PARAM_CODE", length=30)
	private String jtspParamCode;
	
	@Column(name="OPR_SIGN", length =30)
	private String jtspOprSign;
	
	@Column(name="PARAM_VALUE", length=1000)
	private String jtspParamValue;
	
	@Column(name="DESCRIPTION", length=100)
	private String jtspDescription;
	
	@Column(name="VALUE_TYPE", length=1)
	private String jtspType;
	
	@Column(name="BLOCK_ITEM", length=100)
	private String jtspBlockItem;
	
	@Column(name="CREATED_BY",length=15)
	private String jtspCreateBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtspCreateDate;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jtspLastUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtspLastUpdateDate;    	

}
