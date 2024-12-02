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
@Entity

public class LovJtlGroupCode {
	
	@Id
	@Column(name="GROUP_CODE",length=30, nullable = false)
	private String lovJtlGroupCode;
	
	@Column(name="CP_CODE",length=5, nullable = false)
	private String lovJtlCpCode;
	
	@Column(name="ALIASES",length=30)
	private String lovJtlAliases;	

}
