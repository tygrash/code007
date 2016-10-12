import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {
	
	@Test
	public void testCarObjectClass() {
		Car car = new Car("MP-12-G7-9876", "Silver");
		assertEquals(Car.class, car.getClass());
	}
	
	@Test
	public void testCarObjectClassNotEqualToParkingLotClass() {
		Car car = new Car("MP-12-G7-9876", "Silver");
		assertNotEquals(ParkingLot.class, car.getClass());
	}
}
