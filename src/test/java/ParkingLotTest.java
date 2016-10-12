import org.junit.Test;
import static org.junit.Assert.*;

public class ParkingLotTest {
    @Test 
    public void testParkingLotObjectClass() {
       ParkingLot parkingLot = new ParkingLot(6);
       assertEquals(ParkingLot.class, parkingLot.getClass());
    }
}
