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

        System.out.println("The sum of the numbers is " + (a + b + c));
        System.out.println("The product of the numbers is " + (a * b * c));
    }
}