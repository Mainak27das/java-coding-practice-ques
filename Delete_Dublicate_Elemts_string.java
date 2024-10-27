
import java.util.*;
public class Delete_Dublicate_Elemts_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
       System.out.println(Delete_Dublicate_Elemts(str)); 
        
 }
      public static String Delete_Dublicate_Elemts(String str){
        String unique_str="";
           for(int i=0;i<str.length();i++){
              if(unique_str.indexOf(str.charAt(i))==-1){
                unique_str+=str.charAt(i);
              }

           }
           return unique_str;

    
       }
}