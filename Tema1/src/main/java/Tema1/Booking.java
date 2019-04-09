package Tema1;
import java.util.List;
import java.util.ArrayList;

public class Booking {
    List<Client> clients = new ArrayList<Client>();

    public void addBooking(Client client){
        clients.add(client);
    }
    public void removeBooking(Client client){
        clients.remove(client);
    }

    public List<Client> getClients() {
        return clients;
    }
}
