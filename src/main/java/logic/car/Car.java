package logic.car;

public class Car {
    private String name;
    private int model;
    private String color;
    private String id;

    public Car(String name, int model, String color, String id) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }
}
