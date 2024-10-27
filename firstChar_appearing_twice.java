import java.util.HashSet;
import java.util.Scanner;

public class firstChar_appearing_twice {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
       System.out.println(find_firstChar_appearing_twice(str)); 
        
 }
      public static char find_firstChar_appearing_twice (String str){
      HashSet<Character>unique=new HashSet<>() ;
       
       for(int i=0;i<str.length();i++){
        if(unique.contains(str.charAt(i)))
        return str.charAt(i);
        else
        unique.add(str.charAt(i));
        
    
    
       }
       return 0;
 }
}
