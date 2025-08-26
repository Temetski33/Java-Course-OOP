import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("How many integers?");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();


        for (int i = 1; i <= size; i++){
            System.out.println("Enter integer " + i + ": ");
        }


    }
}
