import java.util.*;
public class question{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size= sc.nextInt();
        int index=sc.nextInt();
        int arr[]= new  int[arr_size];
        for(int i=0;i<arr_size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(absoulte_diff_between_left_and_right_elemnts(arr,index) );
        
    }

    public static int absoulte_diff_between_left_and_right_elemnts(int arr[], int idx){
        int sumleft=0;
        int sumright=0;
       for(int i=0;i<idx;i++){
         sumleft+=arr[i];
       }
       for(int i=idx+1;i<arr.length;i++){ 
         sumright+=arr[i];     
      }
      return Math.abs(sumleft-sumright);
   }
}
