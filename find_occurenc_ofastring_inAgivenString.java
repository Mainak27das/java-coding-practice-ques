import java.util.Scanner;

public class find_occurenc_ofastring_inAgivenString {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine(); 
        int str1_size = sc.nextInt();
        sc.nextLine();
        String str2= sc.nextLine();
           
        sc.close();
        
        
       System.out.println(find_occurences_ofastring_inAgivenString (str1,str1_size,str2)); 
    }

    public static int find_occurences_ofastring_inAgivenString(String str1,int str1_size, String str2) {
        int count=0;
        
      for(int i=0;i<=str1_size-str2.length();i++){
       if(str1.substring(i,str2.length()+i).equals(str2))
       count++;
        
        
    }
     return count;
       
    }
    
}
