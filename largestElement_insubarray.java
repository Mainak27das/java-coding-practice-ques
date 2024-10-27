import java.util.*;


public class largestElement_insubarray {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
       int len=sc.nextInt();
        int size = sc.nextInt();
        int arr[] = new int[size];
     
        
       

        // Input array from the user
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int uniquearr[]=find_maxelemnts_of_given_length_subarrays(arr,len);
        for(int i=0;i<uniquearr.length;i++){
            System.out.print(uniquearr[i]);
        }
    }

    public static int[] find_maxelemnts_of_given_length_subarrays(int arr[], int len) {
        ArrayList<Integer>list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
      for(int i=0;i<=arr.length-len;i++){
        max=Integer.MIN_VALUE;
        for(int j=i; j<i+len;j++){
          if(arr[j]>max)
          max=arr[j];
        }
        list.add(max);
      }
       int uniquearr[]=new int[list.size()];
       int idx=0;
       for(int n:list){
        uniquearr[idx++]=n;
       }
       return uniquearr;
  }
    
    
}
