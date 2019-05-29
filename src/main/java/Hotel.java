import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int getBedroomsCount() {
        return bedrooms.size();
    }

    public void setBedroom(ArrayList<Bedroom> bedroom) {
        this.bedrooms = bedroom;
    }

    public int getConferenceRoomsCount() {
        return conferenceRooms.size();
    }

    public void setConferenceRoom(ArrayList<ConferenceRoom> conferenceRoom) {
        this.conferenceRooms = conferenceRoom;
    }

    public void checkInGuestToBedroom(Guest guest, Bedroom bedroom){
        bedroom.addGuest(guest);
    }

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom){
        conferenceRoom.addGuest(guest);
    }

    public void checkOutGuestFromBedroom(Guest guest, Bedroom bedroom){
        bedroom.removeGuest(guest);
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public Booking bookRoom(int nightsBooked, Bedroom bedroom){
         Booking booking = new Booking(nightsBooked, bedroom);
         return booking;
    }

    public ArrayList<Bedroom> getVacantBedrooms(){
        ArrayList<Bedroom> vacantRooms = new ArrayList<Bedroom>();

        for (Bedroom bedroom: this.bedrooms)
            if(bedroom.getGuestCount() == 0){
                vacantRooms.add(bedroom);
            }
        return vacantRooms;
    }

}
