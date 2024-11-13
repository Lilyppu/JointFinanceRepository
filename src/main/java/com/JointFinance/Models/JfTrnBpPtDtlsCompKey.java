package com.JointFinance.Models;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class JfTrnBpPtDtlsCompKey implements Serializable {
	private String jtbpdNo;
	
	private String jtbpdContractNo;
	
	private Integer jtbpdSeqNo;
}
