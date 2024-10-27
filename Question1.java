// Find the pair in array whose sum is = Target and their product is maximum (first no of pair is bigger)
// i/p = [11,9,12,0,8,14,,5,6] target 20 
// o/p = [11,9](11*9,12*8, among them 11*9 is largest)

import java.util.*;
public class Question1 {
    public static int[] find_pair(int arr[], int target){  
        //arrays soting
        int pair[]=new int[2];
        int mul=Integer.MIN_VALUE;;
        int max_mul=Integer.MIN_VALUE;
       
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                mul=arr[i]*arr[j];
             if((arr[i]>arr[j])&&(arr[i]+arr[j]== target)&&(mul>max_mul)){
                pair[0]=arr[i];
                pair[1]=arr[j];
                  max_mul=mul;
             }
            }
        }
        return pair;
    }  
       
    public static void main (String[] args) {  
        Scanner sc=new Scanner(System.in);
            int target=sc.nextInt();
            int size=sc.nextInt();
            int arr[]=new int[size];
        //printing array elements  
        for (int i=0; i<size; i++) {
            arr[i]=sc.nextInt();  
        } 
        sc.close();;
        int pair[]=new int[2];
       pair=find_pair(arr,target);
       for (int i=0; i<2; i++) {
        System.out.print(pair[i]+" ");
    } 
       
           
    } 
    

    
}
