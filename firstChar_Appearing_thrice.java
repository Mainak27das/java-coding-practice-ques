import java.util.Scanner;
public class firstChar_Appearing_thrice {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(findFirstCharAppearingThrice(str));
    }

    public static char findFirstCharAppearingThrice(String str) {
        int[] charCount = new int[256];  // Array to store the frequency of characters (for ASCII values)

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Increment the count of the current character based on its ASCII value
            charCount[currentChar]++;

            // Check if the character has appeared three times
            if (charCount[currentChar] == 3) {
                return currentChar;  // Return the character that appears three times
            }
        }

        return 0;  // Return 0 if no character appears three times
    }
}


