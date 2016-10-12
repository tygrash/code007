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
    public void testCarsInParkingSlots() {
    	ParkingLot parkingLot = new ParkingLot(6);
    	Car carOne = new Car("MH-12 12-222", "White");
    	parkingLot.insert(carOne);
    	Car carTwo = new Car("MH-01 01-299", "Black");
    	parkingLot.insert(carTwo);
    	assertEquals(new Integer(2), parkingLot.totalCars());
    }
}
