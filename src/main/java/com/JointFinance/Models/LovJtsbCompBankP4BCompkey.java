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
public class LovJtsbCompBankP4BCompkey implements Serializable {
	
	private  String lovJtsbBankName;
	
	private String lovJtsbBankAccount;

}
