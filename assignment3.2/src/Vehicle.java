interface Vehicle {
    default void start() {
        System.out.println("Starting");
    }
    default void stop() {
        System.out.println("Stopping");
    }
    default String getInfo() {
        return "data about vehicle";
    }
}

