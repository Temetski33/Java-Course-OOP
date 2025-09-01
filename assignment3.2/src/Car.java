public class Car implements Vehicle {
    private String type = "Car";
    private String color;

    public Car(String color) {
        this.color = color;
    }


    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getColor() {
        return color;
    }
}
