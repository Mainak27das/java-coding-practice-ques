import java.util.Scanner;

public class FindNextPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstprime = sc.nextInt();
        int secondprime = sc.nextInt();
        
        sc.close();
        System.out.println(findIfNextPrime(firstprime, secondprime));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i * i <= n; i++) { // check divisibility up to sqrt(n)
            if (n % i == 0) 
                return false;
        }
        return true;
    }

    public static boolean findIfNextPrime(int first, int second) {
        // Start checking from the number right after 'first'
        for (int i = first + 1; ; i++) {
            if (isPrime(i)) {
                // If the next prime is equal to 'second', return true
                return i == second;
            }
        }
    }
}
