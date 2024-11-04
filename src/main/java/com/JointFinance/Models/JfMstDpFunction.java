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
@Table(name = "JF_MST_DP_FUNCTIONS")
public class JfMstDpFunction {
	
	@Id
	@Column(name="FUNCTION_CODE",length=30,  nullable = false)
	private String jmdfCode;
	
	@Column(name="FUNCTION_NAME",length=100)
	private String jmdfFunctionName;
	
	@Column(name="DESCRIPTION",length=100)
	private String jmdfDescription;
	
	@Column(name="STORE_FUNCTIONS",length=1000)
	private String jmdfStoreDunction;
	
	@Column(name="CREATED_BY",length=15)
	private String jmdfCreatedBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jmdfCreatedDate;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jmdfUpdatedBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jmdfUpadtedDate;
	
	

}
