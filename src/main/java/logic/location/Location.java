package logic.location;

public class Location {
    private final int x;
    private final int y;
    private final String city;

    public Location(int x, int y, String city) {
        this.x = x;
        this.y = y;
        this.city = city;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getCity() {
        return city;
    }
}
