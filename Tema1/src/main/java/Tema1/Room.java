package Tema1;


public class Room extends Client{

    private String checkIn;
    private String checkOut;
    private int numberOfPersons;


    public Room(String firstName, String lastName, String email,long phone, long creditCard,String checkIn, String checkOut, int numberOfPersons) {
        super(firstName, lastName, email,phone, creditCard);
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numberOfPersons = numberOfPersons;

    }

}
