import java.util.*;

public class find_allDublicates_inArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight=sc.nextInt();
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.print(find_max_people(arr,weight));
      
        
 }
      public static int find_max_people(int arr[],int weight){
        Arrays.sort(arr);
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
         
            sum+=arr[i];
            if(sum<=weight)
          count++;
          
          
        }
         return count;
       }
    
    
}
