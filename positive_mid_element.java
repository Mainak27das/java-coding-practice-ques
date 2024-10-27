import java.util.*;
public class positive_mid_element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size= sc.nextInt();
        int arr[]= new  int[arr_size];
        for(int i=0;i<arr_size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
       int result= mid_point(arr);
        
       System.out.println(result);

    
   }
   
   
   public static int mid_point(int arr[]){
    int new_size=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>0)
        new_size++;
       }
      int positive_arr[]=new int[new_size];
      int j=0;
      for(int i=0;i<arr.length;i++){
        
        if(arr[i]>0)
        positive_arr[j++]=arr[i];
      }
      return positive_arr[(positive_arr.length-1)/2];
        

   }
} 
