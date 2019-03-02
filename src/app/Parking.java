package app;

import data.Ticket;

public class Parking {

    public static void main(String[] args) {
        Ticket ticket = new Ticket("75S2KP09", 2.50, "PLN", "2018-05-26 14:53:18", "2018-05-26 15:53:18", "KR123XC");
        ticket.printTicketInfo();
    }
}
