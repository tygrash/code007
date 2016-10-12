import java.util.HashMap;

public class ParkingLot {
	private Integer n;
	
	private HashMap<Integer, Car> parkingLotMapping = new HashMap<>();
	
	public ParkingLot(Integer n) {
		this.n = n;
		for (int i = 1; i <= n; i++) {
			this.parkingLotMapping.put(i, null);
		}
	}
}
