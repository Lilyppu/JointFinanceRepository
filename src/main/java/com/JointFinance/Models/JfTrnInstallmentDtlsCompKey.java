package com.JointFinance.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import java.math.BigDecimal;

//@NoArgsConstructor
//@AllArgsConstructor
@Data
public class JfTrnInstallmentDtlsCompKey implements Serializable{

	private String jtidSofCode;
	private Integer jtidSeqNo;
    private String jtidContractNo;
    private Integer jtidVersionNo;
    private Integer jtidInstNo;
    private Integer jtidPaidSeq;

}
