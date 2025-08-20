import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Fahrenheit to Celsius");

        System.out.println("What is");

        Scanner reader = new Scanner(System.in);
        double fahrenheit = Double.parseDouble(reader.nextLine());
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.printf("it is " + "%.1f", celsius);
    }
}
