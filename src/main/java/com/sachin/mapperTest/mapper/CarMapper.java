package com.sachin.mapperTest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.sachin.mapperTest.modle.Car;
import com.sachin.mapperTest.modle.CarDTO;

@Mapper
public interface CarMapper {
	
	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
	
	
	@Mapping(source="numberOfSeats", target= "seatCount")
	CarDTO carToCarDto(Car car1);

}
