import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    Guest guest;
    ConferenceRoom conferenceRoom;

    @Before
    public void setUp(){
        guest = new Guest("Isa Drennan");
        conferenceRoom = new ConferenceRoom(4,"Craiglang");
    }

    @Test
    public void getName(){
        assertEquals("Craiglang", conferenceRoom.getName());
    }

    @Test
    public void setName(){
        conferenceRoom.setName("Winchester");
        assertEquals("Winchester", conferenceRoom.getName());
    }

    @Test
    public void canSetCapacity(){
        conferenceRoom.setCapacity(2);
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, conferenceRoom.getCapacity());
    }

    @Test
    public void isEmptyOnBegin(){
        assertEquals(0, conferenceRoom.getGuestCount());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }

}
