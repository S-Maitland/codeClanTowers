import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Guest guest;
    Bedroom bedroom;

    @Before
    public void setUp(){
        guest = new Guest("Isa Drennan");
        bedroom = new Bedroom(1,4, "single", 100);
    }

    @Test
    public void getRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void setRoomNumber(){
        bedroom.setRoomNumber(2);
        assertEquals(2, bedroom.getRoomNumber());
    }

    @Test
    public void canSetCapacity(){
        bedroom.setCapacity(2);
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, bedroom.getCapacity());
    }

    @Test
    public void isEmptyOnBegin(){
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestCount());
    }

    @Test
    public void getNightlyRate() {
        assertEquals(100, bedroom.getNightlyRate());
    }
}
