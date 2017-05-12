package com.saisurya.poc.lombok;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Loan {

	private String loanNumber;

	private String borrowerName;

	private String lendername;

	private double loanAmount;

	@Setter(value = AccessLevel.PRIVATE)
	private Property propertyDetails = new Property();

}
