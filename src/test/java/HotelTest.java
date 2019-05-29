import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void setUp() {
        hotel = new Hotel();
        bedroom = new Bedroom(15, 4, "double", 100);
        conferenceRoom = new ConferenceRoom(22, "Savoy Center");
        guest = new Guest("Winston");
    }

    @Test
    public void bedroomsArrayListIsEmptyToBegin(){
        assertEquals(0, hotel.getBedroomsCount());
    }

    @Test
    public void conferenceRoomsArrayListIsEmptyToBegin(){
        assertEquals(0, hotel.getConferenceRoomsCount());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedroomsCount());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRoomsCount());
    }

    @Test
    public void canCheckGuestIntoBedroom(){
        hotel.checkInGuestToBedroom(guest, bedroom);
        assertEquals(1, bedroom.getGuestCount());
    }

    @Test
    public void canCheckGuestIntoConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.getGuestCount());
    }

    @Test
    public void canCreateBooking(){
        Booking booking = hotel.bookRoom(1,bedroom);
        assertEquals(1, booking.getNightsBooked());
        assertEquals(bedroom, booking.getBookedRoom());
    }
}
