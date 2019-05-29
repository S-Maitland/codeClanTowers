import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;


    @Before
    public void setUp(){
        bedroom = new Bedroom(2, 4, "Single", 100);
        booking = new Booking(3, bedroom);
    }

    @Test
    public void getNumberOfNightsBooked(){
        assertEquals(3, booking.getNightsBooked());
    }

    @Test
    public void getBedroom() {
        assertEquals(bedroom, booking.getBookedRoom());
    }

    @Test
    public void canCalculateTotalBill(){
        assertEquals(300, booking.calculateTotalBill());
    }
}
