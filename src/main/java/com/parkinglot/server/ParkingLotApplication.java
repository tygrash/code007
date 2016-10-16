package com.parkinglot.server;

import com.parkinglot.model.Car;
import com.parkinglot.model.ParkingLot;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ParkingLotApplication {
    public static void main(String args[]) {
        ParkingLot parkingLot = null;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            String[] values = command.split(" ");

            switch (values[0]) {
                case "create_parking_lot":
                    parkingLot = new ParkingLot(Integer.parseInt(values[1]));
                    System.out.println("Created a parking lot with " + values[1] + " slots");
                    break;
                case "park":
                    Car car = new Car(values[1], values[2]);
                    System.out.println(parkingLot.park(car));
                    break;
                case "leave":
                    System.out.println(parkingLot.leave(Integer.parseInt(values[1])));
                    break;
                case "status":
                    parkingLot.status();
                    break;
                case "registration_numbers_for_cars_with_colour":
                    System.out.println(parkingLot.getRegistrationsByColour(values[1]));
                    break;
                case "slot_numbers_for_cars_with_colour":
                    System.out.println(parkingLot.getSlotsByCarColour(values[1]));
                    break;
                case "slot_number_for_registration_number":
                    System.out.println(parkingLot.getSlotsByCarRegistration(values[1]));
                    break;
                default:
                    System.out.println("Please enter a valid input!");
                    continue;
            }
        }
    }
}
