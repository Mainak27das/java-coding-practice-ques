import java.util.*;
public class elemnts_largerThan_AllPrevious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
         
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        //Arrays.sort(risk);
       

       int count=0;
      
        for (int i = 0; i < size ; i++) {
            int max=0;
            for (int j = 0; j < i+1; j++) { // Start from j = i + 1 to compare with arr[i]
                if(arr[j]>max){
                    max=arr[j];

                }
                if(arr[i]==max)
                count++;


        }
       
            
        
    }
    System.out.print(count);
    
  }
} 

