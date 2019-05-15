package HotelSystem;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@AllArgsConstructor
@Getter

public class Client {
    private String clientName;
    private String email;
    private long phone;
    private String address;


}
