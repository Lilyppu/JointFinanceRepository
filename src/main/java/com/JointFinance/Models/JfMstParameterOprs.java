package com.JointFinance.Models;

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
@Table(name = "JF_MST_PARAMETER_OPRS")
@IdClass(JfMstParameterOprsCompKey.class)

public class JfMstParameterOprs {
	
	@Id
	@Column(name="PARAM_CODE",length=30,  nullable = false)
	private String jmpoParamCode;
	
	@Id
	@Column(name="OPR_SIGN",length=30,  nullable = false)
	private String jmpoOprSign;
	         
	@Column(name="DESCRIPTION",length=100)
	private String jmpoDescription;
	
	@Column(name="CREATED_BY",length=15)
	private String jmpoCreatedBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jmpoCreatedDate;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jmpoLastUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jmpoLastUpdateDate;  

}
