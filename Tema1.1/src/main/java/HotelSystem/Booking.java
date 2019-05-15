package HotelSystem;

import java.util.List;
import java.util.ArrayList;

public class Booking {
    private  List<Client> clients = new ArrayList<Client>();

    public void addBooking(Client client){
        clients.add(client);
    }

    public void removeBooking(Client client){
        clients.remove(client);
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addRoom(Room myFirstRoom) {
    }
}
