package com.sachin.mapperTest.modle;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Car {
	
	 private String make;
	    private Integer numberOfSeats;

	public Car(String make, Integer numberOfSeats) {
		this.make = make;
		this.numberOfSeats = numberOfSeats;
	}
}
