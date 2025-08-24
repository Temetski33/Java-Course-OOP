import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Give the mass in g: ");
        Scanner reader = new Scanner(System.in);
        double grams = Double.parseDouble(reader.nextLine());

        double luoti = grams / 13.28;
        double naula = luoti / 32;
        double leiviska = naula / 20;

        System.out.printf(grams + " grams is " + leiviska + " leiviska, " + naula + " naula, and " + luoti + " luoti.");
    }
}
