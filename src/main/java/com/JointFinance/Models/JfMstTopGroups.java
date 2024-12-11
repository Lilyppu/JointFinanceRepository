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
@Table(name = "JF_MST_TOP_GROUPS")
public class JfMstTopGroups {

	@Id
    @Column(name = "TOP_ID")
    private Integer jmtgTopId;

    @Column(name = "DESCRIPTION", length = 100)
    private String jmtgDescription;

    @Column(name = "TOP_BEGIN")
    private Integer jmtgTopBegin;

    @Column(name = "TOP_END")
    private Integer jmtgTopEnd;

    @Column(name = "CREATED_BY", length = 15)
    private String jmtgCreatedBy;

    @Column(name = "CREATED_TIMESTAMP")
    private Date jmtgCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 15)
    private String jmtgLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    private Date jmtgLastupdateTimestamp;
	
}
