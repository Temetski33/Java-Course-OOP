public class Task4 {

    public static void main(String[] args) {
        generateNumber();

    }

    static void generateNumber() {
        int number = (int) (Math.random() * 10) + 1;
        System.out.println("Luku: " + number);
    }
}


