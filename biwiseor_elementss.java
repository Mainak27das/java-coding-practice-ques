import java.util.*;

public class biwiseor_elementss {
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
        
        int biwsiearr[]=find_unqueBiwise_Or_of_subarrays(arr);
        for(int i=0;i<biwsiearr.length;i++){
            System.out.print(biwsiearr[i]);
        }
    }

    public static int[] find_unqueBiwise_Or_of_subarrays(int arr[]) {
        int biwsieOr=0;
       
        HashSet<Integer>set=new HashSet<>();
       for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            biwsieOr=0;
         for(int k=i;k<=j;k++){
            biwsieOr=biwsieOr|arr[k];
         }
         set.add(biwsieOr);
        }
       }
       int uniquearr[]=new int[set.size()];
       int idx=0;
       for(Integer num: set){
             uniquearr[idx++]=num;
       }
       return uniquearr;
  }
    
    
}
