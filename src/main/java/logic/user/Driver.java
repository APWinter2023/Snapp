package logic.user;

import logic.car.Car;
import logic.location.Location;
import logic.travel.Travel;

public class Driver extends User{
    private int numberOfTravels;
    private Location location;
    private Travel travel;
    private Car car;
    public Driver(String username, String password) {
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

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
