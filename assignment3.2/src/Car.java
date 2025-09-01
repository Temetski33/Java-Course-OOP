public class Car implements Vehicle {
    private String type = "Car";
    private String fuel;
    private String color;

    public Car(String fuel, String color) {
        this.fuel = fuel;
        this.color = color;
    }


    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getFuel() {
        return fuel;
    }

    @Override
    public String getColor() {
        return color;
    }
}
