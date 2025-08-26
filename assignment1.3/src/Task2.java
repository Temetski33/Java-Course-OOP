public class Task2 {
    public static void main(String[] args) {
        String input = "10110";
        System.out.println(input);
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println(reverse);

        int iterations = input.length();
        int decimal = 0;

        for (int i = 1; i <= iterations; i++) {
            char result = reverse.charAt(i-1);
            System.out.print(result);
        }
    }
}
