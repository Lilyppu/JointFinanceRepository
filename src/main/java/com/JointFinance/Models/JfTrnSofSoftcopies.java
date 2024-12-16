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
@Table(name = "JF_TRN_SOF_SOFTCOPIES")
@IdClass(JfTrnSofSoftcopiesCompKey.class)
public class JfTrnSofSoftcopies {

	@Id
    @Column(name = "SOF_CODE", nullable = false, length = 10)
    private String jtssSofCode;
	
	@Id
    @Column(name = "SEQ_NO", nullable = false)
    private Integer jtssSeqNo;
	
	@Id
    @Column(name = "SOFTCOPY_SEQ_NO", nullable = false)
    private Integer jtssSoftcopySeqNo;
    
    @Column(name = "SOFTCOPY_TYPE", length = 2)
    private String jtssSoftcopyType;

    @Column(name = "SOFTCOPY_CODE", length = 50)
    private String jtssSoftcopyCode;

    @Column(name = "STATUS_FLAG", length = 2)
    private String jtssStatusFlag;

    @Column(name = "LETTER_TYPE", length = 4)
    private String jtssLetterType;

    @Column(name = "CREATED_BY", length = 15)
    private String jtssCreatedBy;
    
    @Column(name = "CREATED_TIMESTAMP")
    private Date jtssCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 15)
    private String jtssLastupdateBy;
    
    @Column(name = "LASTUPDATE_TIMESTAMP")
    private Date jtssLastupdateTimestamp;
}
