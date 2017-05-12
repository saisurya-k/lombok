package com.saisurya.poc.lombok;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Property {
	
	private String propertyName;
	
	private double propertyValue;
	
	@Setter(value=AccessLevel.PRIVATE)
	private Address propertyAddress = new Address();

}
