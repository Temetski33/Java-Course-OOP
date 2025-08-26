import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers into the array: ");

        for (int i = 0; i <= size - 1; i++){
            System.out.println("Enter integer " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }


    }
}
