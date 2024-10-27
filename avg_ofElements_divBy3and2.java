import java.util.Scanner;

public class avg_ofElements_divBy3and2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(avg_ofallElements_divBy3and2 (arr));
        
    
   }
   
   
   public static int avg_ofallElements_divBy3and2(int arr[]){
    int count=0;
    int sum=0;
    
    for(int i=0;i<arr.length;i++){
        if((arr[i]%3==0)&&(arr[i]%2==0)){
            sum+=arr[i];
            count++;
        }
        
    }
   
    return (sum/count);
    
  }
    
}
