import java.util.Scanner;

public class tribonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
       
       System.out.println(find_Tribonnaci_term(n)); 
        
 }
      public static int find_Tribonnaci_term(int n){
       
       if(n==0)
       return 0;
       else if(n==1)
       return 1;
       else if(n==2)
       return 1;
       else
       return find_Tribonnaci_term(n-1)+find_Tribonnaci_term(n-2)+find_Tribonnaci_term(n-3);

      
    
       }
    
}
