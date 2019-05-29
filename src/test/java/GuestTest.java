import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void setUp(){
        guest = new Guest("Jack Jarvis");
    }


    @Test
    public void guestHasName(){
        assertEquals("Jack Jarvis", guest.getName());
    }

    @Test
    public void canSetGuestName(){
        guest.setName("Victor McDade");
        assertEquals("Victor McDade", guest.getName());
    }

}
