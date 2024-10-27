import java.util.Scanner;

public class subarray_with_largestSum {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        int subarr_size=sc.nextInt();
        int size = sc.nextInt();
        int arr[]=new int[size];
       
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
           
        sc.close();
        
        
       System.out.println(find_subarray_with_largestSum (arr,subarr_size)); 
    }

    public static int find_subarray_with_largestSum (int arr[],int n) {
        int sum=0;
        int maxsum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        maxsum=sum;
        
      for(int i=0;i<arr.length-n;i++){
      sum= sum-arr[i]+arr[n+i];
      maxsum=Math.max(sum,maxsum);
        
        
    }
     return maxsum;
       
    }
    
}
