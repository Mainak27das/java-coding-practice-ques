public class DecimalToNBase {

    public static String DectoNBase(int n, int num) {
        // Define the characters used for bases up to 36
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";

        // Convert the decimal number to the specified base
        while (num > 0) {
            int remainder = num % n;  // Get the remainder
            result = characters.charAt(remainder) + result;  // Prepend the character to the result
            num /= n;  // Divide the number by the base
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(DectoNBase(16, 785));  // Output: 4BA
        System.out.println(DectoNBase(21, 5678)); // Output: CI8
    }
}
