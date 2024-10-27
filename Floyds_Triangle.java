import java.util.Scanner;

public class Floyds_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
       find_Floyds_triagle(n); 
        
 }
      public static void find_Floyds_triagle(int n){
        int count=1;
       for(int i=1;i<=n;i++){
        for(int j=0;j<i;j++){
            System.out.print(count+++" ");
        }
        System.out.println();
       }
    
       }
    
}
