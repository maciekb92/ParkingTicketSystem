package app;

import data.Ticket;
import reader.DataReader;

public class Parking {

    public static void main(String[] args) {

        DataReader dataReader = new DataReader();

        Ticket[] ticket = new Ticket[1000];

        ticket[0] = dataReader.createTicket();
        dataReader.close();
        ticket[0].printTicketInfo();
    }

}
