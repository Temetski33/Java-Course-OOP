public class Task1 {
    public static void main(String[] args) {
        System.out.println("Goood morning !!");

        int yks = generateNumber();
        int kaks = generateNumber();

        String[] firstNames = {"Volvo", "Bermard", "Hekuli", "Fabalaba", "Mordo", "Kemppu", "Ring-Ring", "Mimyyli"};
        String[] lastNames = {"Hulivatti", "Hilipatti", "Hollimolli", "Tulikatti", "Virtanen", "Mordoliini", "Pulikeikari", "Kelipuikari"};

        System.out.println(yks);
        System.out.println(kaks);

        /*

        for (String name : firstNames) {
            System.out.println(name);
        }

        for (String name : lastNames) {
            System.out.println(name);
        } */

        String nimi = firstNames[yks] + " " + lastNames[kaks];
        System.out.println(nimi);

    }

    static int generateNumber() {
        return (int) (Math.random() * 7) + 1;
    }



}
