import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test 
    public void testParkingLotObjectClass() {
       ParkingLot parkingLot = new ParkingLot(6);
       assertEquals(ParkingLot.class, parkingLot.getClass());
    }
}
