import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int score = 0;
        do {
            score = score + startGame();

        } while (score != 1);


    }

    static int askMultiplication() {
        int first = generateNumber();
        int second = generateNumber();
        int product = first * second;
        System.out.println("What is " + first + " times " + second + "?");

        Scanner reader = new Scanner(System.in);
        int answer = Integer.parseInt(reader.nextLine());

        if (answer == product) {
            System.out.println("Correct.");
            return 1;
        }
        else {
            System.out.println("Incorrect.");
            System.out.println("The correct answer is " + product + ".");
            return 0;
        }

    }

    static int startGame() {
        System.out.println();
        System.out.println("Welcome to multiplication table exam!");
        System.out.println("You must answer ten questions correctly to pass.");
        System.out.println();

        int correctAnswers = 0;
        for (int i = 1; i <= 10; i++) {
            correctAnswers = correctAnswers + askMultiplication();
            System.out.println(correctAnswers + "/" + i + " correct.");
            System.out.println();
        }
        if (correctAnswers == 10) {
            System.out.println("Congratulations on mastering the multiplication table!");
            return 1;
        }
        else {
            System.out.println("Try again.");
            return 0;

        }
    }

    static int generateNumber() {
        return (int) (Math.random() * 10) + 1;
    }
}


