import java.util.*;
public class find_all_ddublicate_inString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
       System.out.println(find_Dublicate_Elemts(str)); 
        
 }
      public static String find_Dublicate_Elemts(String str){
       String dublicates="";
       
       for(int i=0;i<str.length();i++){
        int count=0;
        
        for(int j=0;j<str.length();j++){
        if(str.charAt(i)==str.charAt(j))
        count++;
        }
        if((count>1)&&dublicates.indexOf(str.charAt(i))==-1)
        dublicates+=str.charAt(i);
       }
      return dublicates;
    
       }
    
}
    
