import java.util.Scanner;

public class Longest_Decreasing_SubSsequence_Array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size= sc.nextInt();
        int arr[]= new  int[arr_size];
        for(int i=0;i<arr_size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(longest_Decreasing_SubSsequence_Array(arr));
    }

    public static int longest_Decreasing_SubSsequence_Array(int arr[]){
      
        
        
            if (arr.length == 0) return 0; // Handle empty array case

            int max = 0;
            int count = 1; // Start with 1 to count the first element
        
            for (int i = 0; i < arr.length - 1; i++) { // Loop until the second last element
                if (arr[i] > arr[i + 1]) {
                    count++; // Increase count if the sequence is decreasing
                } else {
                    max = Math.max(count, max); // Update max length if the sequence ends
                    count = 1; // Reset count for the next potential sequence
                }
            }
        
            // Update max in case the longest sequence is at the end of the array
            max = Math.max(count, max);
        
            return max;

    }
}
