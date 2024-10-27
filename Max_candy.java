import java.util.*;


public class Max_candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size= sc.nextInt();
        int money= sc.nextInt();
        int arr[]= new  int[arr_size];
        for(int i=0;i<arr_size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
       int result= Candy_count(arr,money);
        
       System.out.println(result);
        

    
   }
   
   
   public static int Candy_count(int arr[], int money){
    int count=0;
    int sum=0;
    // Arrays.sort(arr);
    int temp=0;
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
          if(arr[i]>arr[j]){
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;


          }
        }
    }

    for(int i=0;i<arr.length;i++){

           if(arr[i]%5==0){
            count++;
           } 
           else{
            sum+=arr[i];
            if(sum<money)
            count++;
           }
        }
        return count;
        
   }
    
}
