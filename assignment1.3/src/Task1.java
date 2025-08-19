import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a:");
        double a = Integer.parseInt(scanner.nextLine());

        System.out.println("Give b:");
        double b = Integer.parseInt(scanner.nextLine());

        System.out.println("Give c:");
        double c = Integer.parseInt(scanner.nextLine());

        double d = (b * b - 4 * a * c);

        System.out.println("diskrimont on " + (d));

        if (d > 0) {
            System.out.println("yks pos");
            System.out.println("kaks pos");
        }
        else if (d < 0) {
            System.out.println("nuh uh");
        }
        else {
            System.out.println("yeah");
        }


    }
}