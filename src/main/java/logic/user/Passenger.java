package logic.user;

import logic.location.Location;
import logic.travel.Travel;

public class Passenger extends User{
    private int numberOfTravels;
    private Location location;
    private long credit;
    private Travel travel;
    public Passenger(String username, String password) {
        super(username, password);
    }

    public int getNumberOfTravels() {
        return numberOfTravels;
    }

    public void setNumberOfTravels(int numberOfTravels) {
        this.numberOfTravels = numberOfTravels;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public long getCredit() {
        return credit;
    }

    public void setCredit(long credit) {
        this.credit = credit;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }
}
