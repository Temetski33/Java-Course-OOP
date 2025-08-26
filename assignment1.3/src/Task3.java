public class Task3 {
    public static void main(String[] args) {
        System.out.println("hello to all the world");

        int start = 270;
        int end = 500;

        if (start > end) {
            System.out.println("Start cannot be larger than end.");
            return;
        }

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
