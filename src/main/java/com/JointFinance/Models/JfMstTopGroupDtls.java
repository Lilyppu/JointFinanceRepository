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
@IdClass(JfMstTopGroupDtlsCompKey.class)
@Table(name = "JF_MST_TOP_GROUP_DTLS")
public class JfMstTopGroupDtls {

	@Id
    @Column(name = "TOP_ID")
    private Integer jmtgdTopId;
	
	@Id
	@Column(name = "SOF_CODE", length = 10)
    private String jmtgdSofCode;
	
	@Column(name = "CREATED_BY", length = 15)
    private String jmtgdCreatedBy;

    @Column(name = "CREATED_TIMESTAMP")
    private Date jmtgdCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 15)
    private String jmtgdLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    private Date jmtgdLastupdateTimestamp;
}
