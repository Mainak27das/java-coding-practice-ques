
import java.util.Scanner;

public class rotateRight {
     public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        int rotate=sc.nextInt();
        int size = sc.nextInt();
        int arr[] = new int[size];
       

        // Input array from the user
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        int size1=sc.nextInt();
         int arr1[]= new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        sc.close();
        // Print the element with the highest frequency
        int arr3[]=rotate_right(arr,arr1,rotate);
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }

    public static int[] rotate_right(int arr[], int arr1[],int rotate) {
        int indexed_rotated_array[]=new int[arr1.length];
        int rotated_array[]=new int[arr.length];
        int idx=0;
        int idx1=0;
        for(int i=arr.length-rotate ;i<arr.length;i++){
    rotated_array[idx++]=arr[i];   
        }
        for(int i=0;i<arr.length-rotate;i++){
            rotated_array[idx++]=arr[i];  
        }
        for(int i=0;i<indexed_rotated_array.length;i++){
           indexed_rotated_array[idx1++]=rotated_array[arr1[i]];
        }
        return indexed_rotated_array;
   
  }
}
