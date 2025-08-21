import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Let's count the length of a hypotenuse.");

        System.out.println("Give the length of the A leg: ");

        Scanner reader = new Scanner(System.in);
        double a = Double.parseDouble(reader.nextLine());

        System.out.println("Give the length of the B leg: ");
        double b = Double.parseDouble(reader.nextLine());
        double hypotenuse = Math.sqrt(a*a + b*b);
        System.out.printf("The length of the hypotenuse is " + hypotenuse + "lol");
    }
}
