import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom;
    Guest guest;
    Guest guest2;

    @Before
    public void setUp() {
        hotel = new Hotel();
        bedroom = new Bedroom(15, 4, "double", 100);
        bedroom2 = new Bedroom(4, 6, "double", 150);
        bedroom3 = new Bedroom(12, 1, "single", 80);
        conferenceRoom = new ConferenceRoom(22, "Savoy Center");
        guest = new Guest("Winston");
        guest2 = new Guest("Tam");
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
    public void canCheckGuestOutOfBedroom(){
        hotel.checkInGuestToBedroom(guest, bedroom);
        hotel.checkOutGuestFromBedroom(guest, bedroom);
        assertEquals(0, bedroom.getGuestCount());
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

    @Test
    public void returnVacantBedrooms(){
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.checkInGuestToBedroom(guest, bedroom);
        hotel.checkInGuestToBedroom(guest2, bedroom2);
        ArrayList<Bedroom> vacantRooms = hotel.getVacantBedrooms();
        assertEquals(1, vacantRooms.size());
    }
}
