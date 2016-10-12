import org.junit.Test;
import static org.junit.Assert.*;

public class ParkingLotTest {
    @Test 
    public void testParkingLotObjectClass() {
       ParkingLot parkingLot = new ParkingLot(6);
       assertEquals(ParkingLot.class, parkingLot.getClass());
    }
    
    @Test
    public void testParkingLotObjectClassNegativeTest() {
    	ParkingLot parkingLot = new ParkingLot(6);
    	assertNotEquals(Car.class, parkingLot.getClass());
    }
    	
    @Test
    public void testParkingLotEntriesCount() {
    	ParkingLot parkingLot = new ParkingLot(6);
    	assertEquals(new Integer(6), parkingLot.getSlotsCount());
    }
    
    @Test
    public void testParkInALot() {
    	ParkingLot parkingLot = new ParkingLot(6);
    	Car carOne = new Car("KA-01-23-HY66", "White");
    	assertEquals("Allocated slot number: 1", parkingLot.park(carOne));
    }
    
    @Test
    public void testUnavailabilityInParkingLot() {
    	ParkingLot parkingLot = new ParkingLot(1);
    	Car carOne = new Car("HR-26-23-HY66", "White");
    	parkingLot.park(carOne);
    	Car carTwo = new Car("KA-01-23-HY66", "White");
    	assertEquals("Sorry, parking lot is full", parkingLot.park(carTwo));
    }
    
    @Test
    public void testCarsInParkingSlots() {
    	ParkingLot parkingLot = new ParkingLot(6);
    	Car carOne = new Car("MH-12-12-222", "White");
    	parkingLot.park(carOne);
    	Car carTwo = new Car("MH-01-01-299", "Black");
    	parkingLot.park(carTwo);
    	assertEquals(new Integer(2), parkingLot.totalCars());
    }
    
    @Test
    public void testCarLeaveASlot() {
    	ParkingLot parkingLot = new ParkingLot(6);
    	Car carOne = new Car("RJ-02-CB-5244", "White");
    	parkingLot.park(carOne);
    	assertEquals("Slot number 1 is free", parkingLot.leave(1));
    }
    
    @Test
    public void testLeaveNonExistingSlot() {
    	ParkingLot parkingLot = new ParkingLot(6);
    	Car carOne = new Car("RJ-02-CB-5244", "White");
    	parkingLot.park(carOne);
    	assertEquals("Sorry, this slot doesn't exist", parkingLot.leave(7));
    }
    
    @Test
    public void testStatusOfParkingLot() {
    	ParkingLot parkingLot = new ParkingLot(6);
    	Car carOne = new Car("RJ-02-CB-5244", "White");
    	parkingLot.park(carOne);
    	parkingLot.status();
    }
    
    @Test
    public void testRegistrationsForParticularColour() {
    	ParkingLot parkingLot = new ParkingLot(6);
    	Car carOne = new Car("RJ-02-CB-5244", "White");
    	parkingLot.park(carOne);
    	Car carTwo = new Car("MH-12-CX-5744", "Brown");
    	parkingLot.park(carTwo);
    	Car carThree = new Car("GJ-10-RX-7294", "Pink");
    	parkingLot.park(carThree);
    	Car carFour = new Car("RJ-01-GH-5677", "White");
    	parkingLot.park(carFour);
    	Car carFive = new Car("RJ-14-QT-9087", "White");
    	parkingLot.park(carFive);
    	Car carSix = new Car("KA-05-BT-7654", "White");
    	parkingLot.park(carSix);
    	assertEquals("RJ-02-CB-5244, RJ-01-GH-5677, RJ-14-QT-9087, KA-05-BT-7654", parkingLot.getRegistrationsByColour("White"));
    }
}
