import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter a binary number: ");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();

        String reverse = new StringBuilder(input).reverse().toString();

        int iterations = input.length();
        int decimal = 0;

        for (int i = 1; i <= iterations; i++) {
            int currentDigit = i-1;
            char x = reverse.charAt(currentDigit);
            int y = x - '0';

            if (y == 1) {
                int power = (int) Math.pow(2, currentDigit);
                decimal = decimal + power;
            }
        }

        System.out.println("Converted to decimal: " + decimal);
    }
}
