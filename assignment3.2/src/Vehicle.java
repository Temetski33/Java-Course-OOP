interface Vehicle {
    String getType();
    String getColor();

    default void start() {
        System.out.println(getType() + " is starting...");
    }
    default void stop() {
        System.out.println(getType() + " is stopping...");
    }
    default String getInfo() {
        return "type" + getType() + " color" + getColor();
    }
}

