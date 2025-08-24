import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Weight (g): ");
        Scanner reader = new Scanner(System.in);
        int grams = Integer.parseInt(reader.nextLine());

        double luoti = grams / 13.28;
        double naula = luoti / 32;
        double leiviska = naula / 20;

        System.out.printf("%d grams is %d leiviska, %d naula, and %.2f luoti. %n", grams, (int) leiviska, (int) naula, luoti);
    }
}
