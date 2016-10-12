import java.util.HashMap;

public class ParkingLot {
	private Integer slotsCount;
	
	private HashMap<Integer, Car> parkingLotMapping = new HashMap<>();
	
	public ParkingLot(Integer n) {
		this.slotsCount = n;
		for (int i = 1; i <= n; i++) {
			this.parkingLotMapping.put(i, null);
		}
	}
	
	public Integer getSlotsCount() {
		return this.slotsCount;
	}
}
