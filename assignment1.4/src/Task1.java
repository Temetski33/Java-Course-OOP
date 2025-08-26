import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the amount of names to generate: ");

        Scanner reader = new Scanner(System.in);
        int amount = Integer.parseInt(reader.nextLine());

        String[] firstNames = {"Volvo", "Bermard", "Hekuli", "Fabalaba", "Mordo", "Kemppu", "Ring-Ring", "Mimyyli"};
        String[] lastNames = {"Hulivatti", "Hilipatti", "Hollimolli", "Tulikatti", "Virtanen", "Mordoliini", "Pulikeikari", "Kelipuikari"};

        System.out.println();
        System.out.println("Here are your randomly generated names:");

        for (int i = 1; i <= amount; i++) {
            String name = firstNames[generateNumber()] + " " + lastNames[generateNumber()];
            System.out.println(name);
        }

    }

    static int generateNumber() {
        return (int) (Math.random() * 7) + 1;
    }




}
