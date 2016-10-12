import java.util.Collection;
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

	public String leave(int position) {
		if (position >= this.slotsCount || position < 1) {
			return "Sorry, this slot doesn't exist";
		}
		this.parkingLotMapping.put(position, null);
		return "Slot number " + Integer.toString(position) + " is free";
	}
	
	public void status() {
		System.out.println("Slot No." + "\t" + "Registration No" + "\t" + "Colour");
		for (Integer i = 1; i <= this.slotsCount; i++) {
			Car car = this.parkingLotMapping.get(i);
			if (car != null) {
				System.out.println(i + "\t" + car.getRegistrationNo() + "\t" + car.getColour());
			} else {
				System.out.println(i + "\t" + "null" + "\t" + "null");
			}
		}
	}

	public String getRegistrationsByColour(String colour) {
		String registrations = "";
		Collection<Car> cars = this.parkingLotMapping.values();
		for (Car car : cars) {
			if (car != null && car.getColour().equals(colour)) {
				registrations += car.getRegistrationNo() + ", ";
			}
		}
		return registrations.substring(0, registrations.length() - 2);
	}
}
