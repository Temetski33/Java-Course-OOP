public class Bus implements Vehicle {
    private String type = "Bus";
    private String fuel;
    private int capacity;

    public Bus(String fuel, int capacity) {
        this.fuel = fuel;
        this.capacity = capacity;
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
        return "";
    }

    @Override
    public String getInfo() {
        return getType() + " Information: \n" + "Type: " + getType() + "\nFuel: "+ getFuel() + "\nCapacity: " + capacity + " passengers\n";
    }
}
