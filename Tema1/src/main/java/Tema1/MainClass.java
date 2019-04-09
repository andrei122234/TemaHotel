package Tema1;

import java.awt.print.Book;

public class MainClass {




    public static void main(String[] args) {
        Booking myBooking = new Booking();

        final Room firstRoom = new Room("vasile", "radu", "abc@abc.com", 1234567,255555, "22/12/2019","28/12/2019", 2);
        Client firstClient = new Client("vasile","dandu","gjahga",128547666, 254876654);
        myBooking.addBooking(firstRoom);


        myBooking.removeBooking(firstRoom);



        for (Client client : myBooking.getClients()){
            System.out.println("Client" + client);
        }
    }


}