import java.util.*;
public class subarray_with_alrgestSum {
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
        
        System.out.print(find_largest_sum(arr));
    }

    public static int find_largest_sum(int arr[]) {
        int sum=0;
        int largest_sum=0;
       for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
             sum=0;
         for(int k=i;k<=j;k++){
            sum+=arr[k];
         }
         largest_sum=Math.max(largest_sum,sum);
        }
       }
       return largest_sum=Math.max(largest_sum,sum);
  }
    
}
