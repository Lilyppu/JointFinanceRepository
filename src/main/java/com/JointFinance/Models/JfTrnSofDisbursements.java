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
@Table(name = "JF_TRN_SOF_DISBURSEMENTS")
@IdClass(JfTrnSofDisbursementsCompKey.class)
public class JfTrnSofDisbursements {
	
	@Id
	@Column(name = "SOF_CODE", length = 10)
    private String jtsdsSofCode;
	
	@Id
    @Column(name = "SEQ_NO")
    private Integer jtsdsSeqNo;

    @Column(name = "DATE_DISB")
    private Integer jtsdsDateDisb;

    @Column(name = "FIRST_DUEDATE")
    private Integer jtsdsFirstDuedate;

    @Column(name = "CREATED_BY", length = 15)
    private String jtsdsCreatedBy;
    
    @Column(name = "CREATED_TIMESTAMP")
    private Date jtsdsCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 15)
    private String jtsdsLastupdateBy;
    
    @Column(name = "LASTUPDATE_TIMESTAMP")
    private Date jtsdsLastupdateTimestamp;
    
    //private String jtsdsSofCodeDesc;
}
