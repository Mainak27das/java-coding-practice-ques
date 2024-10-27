import java.util.Scanner;

public class Special_Fibonnaci {
     public static void main (String[] args) {  
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the term of series");
            int no=sc.nextInt();
            sc.close();
           
        System.out.print(spcl_fib(no-1));
    } 
    public static int spcl_fib(int n){
        
        if(n<=1)
        return n;
       else
       return spcl_fib( n-1)*spcl_fib( n-1)+spcl_fib( n-2)*spcl_fib( n-2);
    }
}
