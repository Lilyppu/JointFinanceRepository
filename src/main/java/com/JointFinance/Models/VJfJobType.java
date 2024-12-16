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
@Table(name = "V_JF_JOB_TYPE")
public class VJfJobType {
	
	@Id
	@Column(name="JOBTYPE",length=30,nullable = false)
	private String vjjtType;
	
	@Column(name="JOBDESC",length=30)
	private String vjjtDesc;

}
