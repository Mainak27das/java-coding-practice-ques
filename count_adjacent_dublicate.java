import java.util.Scanner;

public class count_adjacent_dublicate {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Read the input string from the user
        String s1 = sc.nextLine();
        
        // Close the Scanner to avoid memory leaks
        sc.close();
        
        // Call the method to count adjacent duplicates and print the result
        System.out.println(findCountAdjacentDuplicate(s1));
    }

    // This method counts the number of adjacent duplicate characters in the string
    public static int findCountAdjacentDuplicate(String s1) {
        int count = 0;  // Initialize the counter to store the number of adjacent duplicates
        
        // Loop through the string, stopping at the second-to-last character
        for (int i = 0; i < s1.length() - 1; i++) {
            // Check if the current character and the next one are the same
            if (s1.charAt(i) == s1.charAt(i + 1)) {
                count++;  // Increment the counter if adjacent characters are the same
            }
        }
        
        // Return the total count of adjacent duplicates
        return count;
    }
    
}
