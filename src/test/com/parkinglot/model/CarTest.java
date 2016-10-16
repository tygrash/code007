package com.parkinglot.model;

import com.parkinglot.model.Car;
import com.parkinglot.model.ParkingLot;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.BeforeClass;

public class CarTest {
	private static Car car;
	
	@BeforeClass
    public static void setup() {
		car = new Car("MP-12-G7-9876", "Silver");
	}
	
	@Test
	public void testCarObjectClass() {
		assertEquals(Car.class, car.getClass());
	}
	
	@Test
	public void testCarObjectClassNotEqualToParkingLotClass() {
		assertNotEquals(ParkingLot.class, car.getClass());
	}
}
