import java.util.ArrayList;

public class Booking {

    private int nightsBooked;
    private Bedroom bookedRoom;

    public Booking(int nightsBooked, Bedroom bedroom){
        this.nightsBooked = nightsBooked;
        this.bookedRoom = bedroom;
    }

    public int getNightsBooked() {
        return this.nightsBooked;
    }

    public void setNightsBooked(int nightsBooked) {
        this.nightsBooked = nightsBooked;
    }

    public Bedroom getBookedRoom() {
        return this.bookedRoom;
    }

    public int calculateTotalBill(){
        return this.nightsBooked * this.bookedRoom.getNightlyRate();
    }
}
