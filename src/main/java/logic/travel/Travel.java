package logic.travel;

import logic.location.Location;
import logic.user.Driver;
import logic.user.Passenger;

public class Travel {
    private Location source;
    private Location destination;
    private long cost;
    private Passenger passenger;
    private Driver driver;

    public Travel(Location source, Location destination, Passenger passenger) {
        this.source = source;
        this.destination = destination;
        this.passenger = passenger;
        setCostOfTravel();
    }

    private void setCostOfTravel() {
        //toDo
        cost = 0;
    }
}
