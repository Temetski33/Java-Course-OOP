public class Task1 {
    public static void main(String[] args) {
        System.out.println("Goood morning !!");

        int yks = generateNumber();
        int kaks = generateNumber();

        System.out.println(yks);
        System.out.println(kaks);

    }

    static int generateNumber() {
        return (int) (Math.random() * 10) + 1;
    }



}
