package com.JointFinance.Models;

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
@Table(name = "V_LOV_SOFTARGET")
public class VLovSofTarget {
	@Id
	@Column(name="LOVST_SOF_CODE", length=10,  nullable = false)
	private String lovst_sof_code;
	
	@Column(name="LOVST_DESCRIPTION", length=100)
	private String lovst_description;
	
	@Column(name="LOVST_ALIASES", length=10)
	private String lovst_aliases;
}
