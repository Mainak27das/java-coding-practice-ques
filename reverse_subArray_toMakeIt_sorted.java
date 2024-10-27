import java.util.*;
public class reverse_subArray_toMakeIt_sorted {
   
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt(); 
            int arr[]=new int[size];
            for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
            }
    sc.close();
            if (canSortByReversingSubarray(arr)) {
                System.out.println("Yes, reversing a subarray can sort the array.");
            } else {
                System.out.println("No, reversing a subarray cannot sort the array.");
            }
        }
    
        public static boolean canSortByReversingSubarray(int[] arr) {
            int n = arr.length;
    
            // Step 1: Create a copy of the original array and sort it
            int[] sortedArr = arr.clone();
            Arrays.sort(sortedArr);
    
            // Step 2: Try reversing all subarrays and compare to sortedArr
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    // Reverse subarray from i to j
                    reverse(arr, i, j);
    
                    // Check if the reversed array equals the sorted array
                    if (Arrays.equals(arr, sortedArr)) {
                        return true;
                    }
    
                    // Restore the original array by reversing the subarray back
                    reverse(arr, i, j);
                }
            }
    
            // If no subarray reversal results in a sorted array
            return false;
        }
    
        // Helper method to reverse the subarray from index start to end
        public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
}