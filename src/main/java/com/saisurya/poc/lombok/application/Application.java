package com.saisurya.poc.lombok.application;

import java.util.logging.Level;

import com.saisurya.poc.lombok.Loan;

import lombok.val;
import lombok.extern.java.Log;

@Log
public class Application {
	
	public static void main(String[] args) {
		//val works only on method level varibales(local) and loop variables but not on fields
		val loan = new Loan();
		loan.setLoanNumber("1234567890");
		loan.setBorrowerName("XYZ");
		loan.setLendername("Mr.Cooper");
		loan.setLoanAmount(30000.00);
		loan.getPropertyDetails().setPropertyName("ABC Home");
		loan.getPropertyDetails().setPropertyValue(50000.00);
		loan.getPropertyDetails().getPropertyAddress().setArea("XYZ");
		loan.getPropertyDetails().getPropertyAddress().setZipCode("52206");
		log.log(Level.WARNING, loan.toString());
		
	}

}
