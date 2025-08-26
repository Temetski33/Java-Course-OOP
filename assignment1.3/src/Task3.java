import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter start of range: ");
        Scanner reader = new Scanner(System.in);
        int start = Integer.parseInt(reader.nextLine());

        System.out.println("Enter end of range: ");
        int end = Integer.parseInt(reader.nextLine());

        if (start > end) {
            System.out.println("Start cannot be larger than end.");
            return;
        } else if (end < 0 || start < 0) {
            System.out.println("Start and end must be positive.");
            return;
        }

        System.out.println("Here are the prime numbers in the range:");

        for (int i = start; i <= end; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }


    }

    static boolean checkPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
