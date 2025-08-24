import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Give the mass in g: ");
        Scanner reader = new Scanner(System.in);
        double grams = Double.parseDouble(reader.nextLine());

        double luoti = grams / 13.8;

        System.out.println(luoti);
    }
}
