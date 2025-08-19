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
            System.out.println("Your answer is correct!");
            return 1;
        }
        else {
            System.out.println("Not quite!");
            System.out.println("The correct answer is " + product + ".");
            return 0;
        }

    }

    static int startGame() {
        System.out.println("Welcome to game!!!!!!");

        int surpa = 0;
        for (int i = 1; i <= 10; i++) {
            surpa = surpa + askMultiplication();
            System.out.println(surpa + " out of " + i + " answers correct so far.");
        }
        if (surpa == 10) {
            System.out.println("hurrau");
            return 1;
        }
        else {
            System.out.println("nt yri");
            return 0;

        }
    }

    static int generateNumber() {
        return (int) (Math.random() * 10) + 1;
    }
}


