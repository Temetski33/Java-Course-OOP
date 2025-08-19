public class Task4 {

    public static void main(String[] args) {
        generateNumber();
        askMultiplication();

    }

    static void askMultiplication() {
        int first = 2;
        int second = 4;
        int product = first * second;
        System.out.println("What is " + first + " times " + second + "?");
        System.out.println("The answer is " + product + ".");
    }

    static void generateNumber() {
        int number = (int) (Math.random() * 10) + 1;
        System.out.println("Luku: " + number);
    }
}


