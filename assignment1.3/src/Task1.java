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

        double discriminant = (b * b - 4 * a * c);

        System.out.println("diskrimont on " + (discriminant));

        if (discriminant > 0) {
            double pospos = ((-b + Math.sqrt(discriminant)) / (2 * a));
            double negneg = ((-b - Math.sqrt(discriminant)) / (2 * a));
            System.out.println("The equation has two roots.");
            System.out.println("The first root is " + pospos);
            System.out.println("The second root is " + negneg);
        }
        else if (discriminant == 0) {
            double setit = (-b / (2 * a));
            System.out.println("The equation has one real root.");
            System.out.println("The root is " + setit);
        }
        else {
            System.out.println("The equation has no real roots.");
        }


    }
}