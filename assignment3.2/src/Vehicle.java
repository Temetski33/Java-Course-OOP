interface Vehicle {
    default void start() {
        System.out.println("is tarting...");
    }
    default void stop() {
        System.out.println("is stopping...");
    }
    default String getInfo() {
        return "data about vehicle";
    }
}

