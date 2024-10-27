public class PrimeUptoN {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // returnn 0
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to print prime numbers up to n
    public static void PrintPrime(int n) {
        for (int j = 2; j <= n; j++) {
            if (isPrime(j)) {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        // Test case
        PrintPrime(10); // Output: 2, 3, 5, 7
    }
}
