import java.util.*;
public class maid_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int times = sc.nextInt();  // Number of times the rearrangement happens
        int size = sc.nextInt();   // Size of the array
        char line[] = new char[size];
        
        // Reading the initial arrangement of the line
        for (int i = 0; i < size; i++) {
            line[i] = sc.next().charAt(0);
        }

        sc.close();
        
        // Call the method to find the new arrangement after the swaps
        System.out.print(findNewLine(line, times));
    }

    public static String findNewLine(char line[], int times) {
        char temp;
        
        // Perform the rearrangement 'times' times
        while (times > 0) {
            // Go through the line and swap adjacent 'B' and 'G' if needed
            for (int i = 0; i < line.length - 1; i++) {
                // If 'B' is followed by 'G', swap them
                if (line[i] == 'B' && line[i + 1] == 'G') {
                    // Swap 'B' and 'G'
                    temp = line[i];
                                        line[i] = line[i + 1];
                    line[i + 1] = temp;
                    // Skip the next position after a swap
                    i++;
                }
            }
            // Reduce the times by 1 after each pass
            times--;
        }
        // Return the final arrangement of characters as a string
        return new String(line);
    }
}
