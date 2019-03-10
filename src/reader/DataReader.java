package reader;

import data.Ticket;

import java.time.LocalDateTime;
import java.util.Scanner;

public class DataReader {

    private Scanner scanner = new Scanner(System.in);

    public void close() {
        scanner.close();
    }

    private String readVehicleRegistrationNumber() {
        System.out.println("Enter vehicle registration number: ");
        String amountOfPurchase = scanner.nextLine();
        return amountOfPurchase;
    }

    private Double readAmountOfPurchase() {
        System.out.println("Enter amount Of purchase: ");
        Double parkingAmount = scanner.nextDouble();
        //close();
        return parkingAmount;
    }

    public Ticket createTicket() {

        String vehicleRegistrationNumber = readVehicleRegistrationNumber();
        Double amountOfPurchase = readAmountOfPurchase();
        LocalDateTime now = LocalDateTime.now();

        return new Ticket("75S2KP09", 2.50, amountOfPurchase, "PLN", now, "2019-01-08", vehicleRegistrationNumber);
    }

}
