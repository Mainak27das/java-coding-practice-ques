import java.util.*;
public class gcd_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();
        }
        sc.close();
        find_gcd_lcm(arr);
       
        
 }

    public static int find_gcd(int a, int b){
        if(b==0)
        return a;
        return find_gcd(b,a%b);
    }
    public static int find_lcm(int a, int b){
        
        return (a*b)/find_gcd(a,b);
    }
      public static void find_gcd_lcm(int arr[]){
        int result=arr[0];
        for(int i=0;i<arr.length;i++){
            result=find_gcd(result,arr[i]);
        }
        System.out.print("gcd is"+ result);
         result=arr[0];
        for(int i=0;i<arr.length;i++){
            result=find_lcm(result,arr[i]);
        }
        System.out.print("gcd is"+ result);
       }
    
    
}
