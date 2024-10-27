import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine(); 
        sc.close();
        
        
       System.out.println(find_largest_word(str1)); 
    }

    public static int find_largest_word(String str1) {
        String words[]=str1.split("\\.");
        
        int maxlen=0;
        
      for(int i=0;i<words.length;i++){
       maxlen=Math.max(words[i].length(),maxlen);
        
        
    }
     return maxlen;
       
    }
    
}
