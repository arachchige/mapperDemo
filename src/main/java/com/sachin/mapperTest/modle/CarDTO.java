package com.sachin.mapperTest.modle;

import lombok.Data;

@Data
public class CarDTO {
	 private String make;
	    private String seatCount;


	public CarDTO() {

	}

	public void setSeatCount(String seatCount){
		this.seatCount= seatCount;
	}
}
