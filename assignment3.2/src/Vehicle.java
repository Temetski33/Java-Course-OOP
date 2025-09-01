interface Vehicle {
    String getType();
    String getFuel();
    String getColor();

    default void start() {
        System.out.println(getType() + " is starting...");
    }
    default void stop() {
        System.out.println(getType() + " is stopping...");
    }
    default String getInfo() {
        return getType() + " Information: \n" + "Type: " + getType() + "\nFuel: "+ getFuel() + "\nColor: " + getColor() + "\n";
    }
}

