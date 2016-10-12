import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.BeforeClass;

public class ParkingLotTest {
	private static ParkingLot parkingLot;
	
	@BeforeClass
    public static void setup() {
		parkingLot = new ParkingLot(6);
    	Car carOne = new Car("RJ-02-CB-5244", "White");
    	parkingLot.park(carOne);
    	Car carTwo = new Car("MH-12-CX-5744", "Brown");
    	parkingLot.park(carTwo);
    	Car carThree = new Car("GJ-10-RX-7294", "Pink");
    	parkingLot.park(carThree);
    	Car carFour = new Car("KA-05-BT-7654", "White");
    	parkingLot.park(carFour);
    	Car carFive = new Car("RJ-14-QT-9087", "White");
    	parkingLot.park(carFive);
	}
	
    @Test 
    public void testParkingLotObjectClass() {
       assertEquals(ParkingLot.class, parkingLot.getClass());
    }
    
    @Test
    public void testParkingLotObjectClassNegativeTest() {
    	assertNotEquals(Car.class, parkingLot.getClass());
    }
    	
    @Test
    public void testParkingLotEntriesCount() {
    	assertEquals(new Integer(6), parkingLot.getSlotsCount());
    }
    
    @Test
    public void testParkInALot() {
    	Car carSix = new Car("KA-01-23-HY66", "White");
    	assertEquals("Allocated slot number: 6", parkingLot.park(carSix));
    }
    
    @Test
    public void testUnavailabilityInParkingLot() {
    	Car carSeven = new Car("KA-01-23-HY67", "White");
    	assertEquals("Sorry, parking lot is full", parkingLot.park(carSeven));
    }
    
    @Test
    public void testCarsInParkingSlots() {
    	assertEquals(new Integer(5), parkingLot.totalCars());
    }
    
    @Test
    public void testCarLeaveASlot() {
    	assertEquals("Slot number 1 is free", parkingLot.leave(1));
    }
    
    @Test
    public void testLeaveNonExistingSlot() {
    	assertEquals("Sorry, this slot doesn't exist", parkingLot.leave(7));
    }
    
    @Test
    public void testStatusOfParkingLot() {
    	parkingLot.status();
    }
    
    @Test
    public void testRegistrationsForParticularCarColour() {
    	assertEquals("RJ-02-CB-5244, KA-05-BT-7654, RJ-14-QT-9087", parkingLot.getRegistrationsByColour("White"));
    }
    
    @Test
    public void testSlotsForParticularCarColour() {
    	assertEquals("1, 4, 5", parkingLot.getSlotsByCarColour("White"));
    }
    
    @Test
    public void testSlotForParticularRegistration() {
    	assertEquals("1", parkingLot.getSlotsByCarRegistration("RJ-02-CB-5244"));
    }
}
