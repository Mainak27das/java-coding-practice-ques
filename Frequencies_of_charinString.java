import java.util.Scanner;

public class Frequencies_of_charinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();

        for (int i = 0; i < str.length(); i++) {
            // Skip characters already counted
            if (str.indexOf(str.charAt(i)) != i) {
                continue;
            }

            int freq = 0; // Initialize frequency count

            // Count occurrences of the current character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    freq++;
                }
            }

            // Print frequency of the character
            System.out.println(str.charAt(i) + " Frequency is " + freq);
        }
    }
}
