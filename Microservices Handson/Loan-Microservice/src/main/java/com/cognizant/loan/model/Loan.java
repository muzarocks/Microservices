package com.cognizant.loan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Loan {

	private String number;
	private String type;
	private int Loan;
	private int emi;
	private int tenure;

}
