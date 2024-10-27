import java.util.Scanner;

public class substring_with_most_a{
     public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine(); 
        int n = sc.nextInt();
           
        sc.close();
        
        
       System.err.println(find_given_lenngth_substring_with_most_a (str,n)); 
    }

    public static int find_given_lenngth_substring_with_most_a(String str,int n) {
        int maxcount=0;
        int count=0;
      for(int i=0;i<str.length();i++){
        if(i%n==0){
            maxcount=Math.max(maxcount, count);
            count=0;
          }
        if(str.charAt(i)=='a')
        count++;
        
    }
      return Math.max(maxcount, count);
       
    }
    
}
