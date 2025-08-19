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

        if (discriminant > 0) {
            double posroot = ((-b + Math.sqrt(discriminant)) / (2 * a));
            double negroot = ((-b - Math.sqrt(discriminant)) / (2 * a));
            System.out.println("The equation has two roots.");
            System.out.println("The first root is " + posroot);
            System.out.println("The second root is " + negroot);
        }
        else if (discriminant == 0) {
            double oneroot = (-b / (2 * a));
            System.out.println("The equation has one real root.");
            System.out.println("The root is " + oneroot);
        }
        else {
            System.out.println("The equation has no real roots.");
        }


    }
}