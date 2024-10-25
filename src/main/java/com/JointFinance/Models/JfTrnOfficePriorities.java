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
@Table(name = "JF_TRN_OFFICE_PRIORITIES")
@IdClass(JfTrnOfficePrioritiesCompKey.class)
public class JfTrnOfficePriorities {
	
	@Id
	@Column(name="OFFICE_CODE",length=5,  nullable = false)
	private String jtopOfficeCode;
	
	@Id
	@Column(name="SOF_CODE",length=10,  nullable = false)
	private String jtopSofCode;
	
	@Column(name="PRIORITY")
	private Integer jtopPriority;
	
	@Column(name="CREATED_BY",length=15)
	private String jtopCreateBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date jtopCreateDate;
	
	@Column(name="LASTUPDATE_BY",length=15)
	private String jtopUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date jtopUpdateDate;	
	 
}
