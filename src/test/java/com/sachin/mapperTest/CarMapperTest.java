package com.sachin.mapperTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.sachin.mapperTest.mapper.CarMapper;
import com.sachin.mapperTest.modle.Car;
import com.sachin.mapperTest.modle.CarDTO;

public class CarMapperTest {
	
	@Test
	public void shouldMatchWithCarDto() {
		//given
		Car car1 = new Car("Nissan",5);
		
		//when
		CarDTO carDto = CarMapper.INSTANCE.carToCarDto(car1);

		//then
		assertThat(carDto).isNotNull();
		assertThat( carDto.getMake() ).isEqualTo( "Nissan" );
		assertThat(carDto.getSeatCount()).isEqualTo("5");
		
	}

}
