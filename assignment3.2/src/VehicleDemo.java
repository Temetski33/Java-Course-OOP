public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("Petrol", "Red");
        Vehicle motorcycle = new Motorcycle();
        Vehicle bus = new Bus();

        System.out.println("Vehicle demonstration");
        System.out.println();

        car.start();
        car.stop();
        System.out.println(car.getInfo());

        /*
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());

         */
    }
}
