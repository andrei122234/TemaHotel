package HotelSystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Room{

    private int roomNumber;
    private Data Checkin;
    private Data Checkout;
    private int numberOfPersons;


}


