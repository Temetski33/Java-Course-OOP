import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers into the array: ");

        for (int i = 0; i < size; i++){
            System.out.println("Enter integer " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        String maxRange = "";
        int maxSum = 0;

        // This triple for-loop is not pretty but it works
        for (int x = 1; x <= size; x++) {
            for (int y = x; y <= size; y++) {
                String currentRange = x + "-" + y;
                int currentSum = 0;

                for (int z = x; z <= y; z++) {
                    currentSum = currentSum + numbers[z-1];
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxRange = currentRange;
                }
            }
        }

        System.out.println();
        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + maxRange);


    }
}
