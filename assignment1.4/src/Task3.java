import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
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

        Integer[] newNumbers = new Integer[size];
        int counter = 0;

        for (int element : numbers) {
            if (!Arrays.asList(newNumbers).contains(element)) {
                newNumbers[counter] = element;
                counter++;
            }
        }

        System.out.println();
        System.out.println("The array without duplicates: ");
        for (int i = 0; i < counter; i++) {
            System.out.print(newNumbers[i] + " ");
        }


    }
}
