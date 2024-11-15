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
@Entity
@Table(name = "JF_MST_LETTER_TYPES")
public class JfMstLetterTypes {
	
	@Id
	@Column(name="LETTER_TYPE",length=4,  nullable = false)
	private String jmltLetterType;
	
	@Column(name="DESCRIPTION",length=50)
	private String jmltDescription;	
	
	@Column(name="EMAIL_SUBJECT",length=100)
	private String jmltEmailSubject;	
	
	@Column(name="EMAIL_NOTES",length=100)
	private String jmltEmailNotes;	

}
