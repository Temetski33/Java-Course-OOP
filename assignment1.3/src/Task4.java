import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int score = 0;
        // generateNumber();
        askMultiplication();

    }

    static void askMultiplication() {
        int first = generateNumber();
        int second = generateNumber();
        int product = first * second;
        System.out.println("What is " + first + " times " + second + "?");

        Scanner reader = new Scanner(System.in);
        int answer = Integer.parseInt(reader.nextLine());
        System.out.println(answer);

        if (answer == product) {
            System.out.println("Your answer is correct!");
        }
        System.out.println("The answer is " + product + ".");
    }

    static int generateNumber() {
        int number = (int) (Math.random() * 10) + 1;
        System.out.println("Luku: " + number);
        return number;
    }
}


