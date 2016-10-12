import java.util.HashMap;

public class ParkingLot {
	private Integer slotsCount;
	
	private HashMap<Integer, Car> parkingLotMapping = new HashMap<>();
	
	public ParkingLot(Integer totalSlots) {
		this.slotsCount = totalSlots;
		for (int i = 1; i <= totalSlots; i++) {
			this.parkingLotMapping.put(i, null);
		}
	}
		
	public Integer getSlotsCount() {
		return this.slotsCount;
	}
	
	public Integer totalCars() {
		Integer count = 0;
		for (Integer i = 1; i <= this.parkingLotMapping.size(); i++) {
			if (this.parkingLotMapping.get(i) != null) {
				count++;
			}
		}
		return count;
	}

	public String park(Car carOne) {
		Integer emptySlot = getFreeSlot();
		if (emptySlot.equals(0)) {
			return "Sorry, parking lot is full";
		}
		this.parkingLotMapping.put(emptySlot, carOne);
		return "Allocated slot number: " + Integer.toString(emptySlot);
	}
	
	private Integer getFreeSlot() {
		for (Integer i = 1; i <= this.parkingLotMapping.size(); i++) {
			if (this.parkingLotMapping.get(i) == null) {
				return i;
			}
		}
		return 0;
	}
}
