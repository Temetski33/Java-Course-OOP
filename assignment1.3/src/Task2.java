public class Task2 {
    public static void main(String[] args) {
        String input = "10110";
        System.out.println(input);
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println(reverse);

        int iterations = input.length();
        int decimal = 0;

        for (int i = 1; i <= iterations; i++) {
            int currentDigit = i-1;
            char x = reverse.charAt(currentDigit);
            int y = x - '0';

            int power = (int) Math.pow(2, currentDigit);
            decimal = decimal + power;
        }

        System.out.println("Converted to decimal: " + decimal);
    }
}
