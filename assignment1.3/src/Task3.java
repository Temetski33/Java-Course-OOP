public class Task3 {
    public static void main(String[] args) {
        System.out.println("hello to all the world");

        int start = 27;
        int end = 50;

        for (int i = start; i <= end; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }


    }

    static boolean checkPrime(int n) {
        if (n <= 1)
            return false;

        // Check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
