import java.util.Scanner;

public class add_two_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        
        sc.close();
        System.out.println(find_binnary_sum(s1,s2));
        
    }

    

    public static String find_binnary_sum( String s1, String s2) {
       int n1=Integer.parseInt(s1,2);
       int n2=Integer.parseInt(s2,2);
       return Integer.toBinaryString(n2+n1);
    }
    
}
