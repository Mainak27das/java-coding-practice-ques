import java.util.Arrays;
import java.util.Scanner;

public class higestFreq_lemnt_inArray {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        // Input array from the user
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();

        // Print the element with the highest frequency
        System.out.println(find_highestFreq_elemnt_inArr(arr));
    }

    public static int find_highestFreq_elemnt_inArr(int arr[]) {
        Arrays.sort(arr);  // Sort the array

        int count = 1;      // Initialize count for the first element
        int max_count = 1;  // Track the maximum frequency

        // First loop: find the maximum frequency
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;  // Increment count if the current element is the same as the next
            } else {
                max_count = Math.max(max_count, count);  // Update max_count if needed
                count = 1;  // Reset count for the next element
            }
        }

        // Final check to include the last element's frequency
        max_count = Math.max(max_count, count);

        // Second loop: find the element with the maximum frequency
        count = 1;  // Reset count for second iteration
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;  // Increment count for repeated elements
            } else {
                if (count == max_count) {
                    return arr[i];  // Return the element with the highest frequency
                }
                count = 1;  // Reset count for the next element
            }
        }

        // Handle the case for the last element in the array
        if (count == max_count) {
            return arr[arr.length - 1];
        }

        return -1;  // Return -1 if no element found (edge case, shouldn't happen)
    }
}
