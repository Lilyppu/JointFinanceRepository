package com.JointFinance.Models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "JF_MST_PARAMETERS")

public class JfMstParameters {
	
	@Id
	@Column(name="PARAM_CODE",length=30,  nullable = false)
	private String jmpParamCode;
	
	@Column(name="PARAM_NAME",length=100)
	private String jmpParamName;
	
	@Column(name="DESCRIPTION",length=100)
	private String jmpDescription;
	
	@Column(name="SELECT_STATEMENTS",length=2000)
	private String jmpSelectStatements;
	
	@Column(name="DATA_TYPE",length=2)
	private String jmpDataType;
	
	@Column(name="CREATED_BY",length=15)
	private String jmpCreatedBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jmpCreatedTimestamp;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jmpLastupdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jmpLastupdateTimestamp;
	
	@Column(name="CUST_TYPE",length=1)
	private String jmpCustType;

}
