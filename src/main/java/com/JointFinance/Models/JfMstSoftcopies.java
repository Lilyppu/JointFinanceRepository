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
@Table(name = "JF_MST_SOFTCOPIES")
public class JfMstSoftcopies {

	@Id
    @Column(name = "SOFTCOPY_CODE", nullable = false, length = 50)
    private String jmscSoftcopyCode;

    @Column(name = "DESCRIPTION", length = 100)
    private String jmscDescription;

    @Column(name = "SOFTCOPY_TYPE", length = 5)
    private String jmscSoftcopyType;
    
    @Column(name = "USE_PROC", length = 2)
    private String jmscUseProc;

    @Column(name = "STORE_PROCEDURE", length = 2000)
    private String jmscStoreProcedure;

    @Column(name = "STATUS_FLAG", length = 1)
    private String jmscStatusFlag;

    @Column(name = "PREVIEW", length = 4000)
    private String jmscPreview;

    @Column(name = "CREATED_BY", length = 15)
    private String jmscCreatedBy;
    
    @Column(name = "CREATED_TIMESTAMP")
    private Date jmscCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 15)
    private String jmscLastupdateBy;
    
    @Column(name = "LASTUPDATE_TIMESTAMP")
    private Date jmscLastupdateTimestamp;
}
