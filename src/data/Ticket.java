package data;

import java.time.LocalDateTime;

public class Ticket {
    private String ticketId;
    private Double ticketPrice;
    private Double amountOfPurchase;
    private String currency;
    private LocalDateTime dateOfPurchase;
    private String expirationDate;
    private String vehicleRegistrationNumber;
    private final String emergencyPhoneNumber = "123456789";

    //Constructors
    public Ticket(String ticketId, Double ticketPrice, Double amountOfPurchase, String currency, LocalDateTime dateOfPurchase, String expirationDate, String vehicleRegistrationNumber) {
        this.setTicketId(ticketId);
        this.setTicketPrice(ticketPrice);
        this.setAmountOfPurchase(amountOfPurchase);
        this.setCurrency(currency);
        this.setDateOfPurchase(dateOfPurchase);
        this.setExpirationDate(expirationDate);
        this.setVehicleRegistrationNumber(vehicleRegistrationNumber);
    }

    //Getters and Setters
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Double getTicketPrice() {
            return ticketPrice;
        }

        public void setTicketPrice(Double ticketPrice) {
            this.ticketPrice = ticketPrice;
    }

    public Double getAmountOfPurchase() {
        return amountOfPurchase;
    }

    public void setAmountOfPurchase(Double amountOfPurchase) {
        this.amountOfPurchase = amountOfPurchase;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDateTime getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    private String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    private void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }

    private String getEmergencyPhoneNumber() {
        return emergencyPhoneNumber;
    }

    //Method to print information about ticket
    public void printTicketInfo() {
        String ticketInformation = "Ticket ID: " + getTicketId() + "\n" +
                "Ticket price: " + getTicketPrice() + getCurrency() + "\n" +
                "Amount Of purchase: " + getAmountOfPurchase() + "\n" +
                "Purchase date: " + getDateOfPurchase() + "\n" +
                "Expiration date: " + getExpirationDate() + "\n" +
                "Vehicle registration number: " + getVehicleRegistrationNumber() + "\n" +
                "Emergency phone number: " + getEmergencyPhoneNumber();
        System.out.println(ticketInformation);
    }
}
