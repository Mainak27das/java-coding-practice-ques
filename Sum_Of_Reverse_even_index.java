import java.util.*;
public class Sum_Of_Reverse_even_index{
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);

     int size=sc.nextInt();
     
      int arr[]=new int [size];
      for(int i=0;i<size;i++){
         arr[i]=sc.nextInt();
        }
        sc.close();
          int sum=0;
          for(int i=0;i<arr.length;i++){
            if((arr.length-i-1)%2==0){
              sum+=arr[i];
            }


          }
          
          System.out.println(sum);


   }



}