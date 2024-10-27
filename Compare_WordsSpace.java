import java.util.*;
public class Compare_WordsSpace {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
       String str1= sc.nextLine();
       String str2= sc.nextLine();
       sc.close();
       System.out.println(oddd_Even_Space_Count(str1,str2));
    }
       public static String oddd_Even_Space_Count(String str1, String str2){
        int count1=0;
        int count2=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==' ')//str[i]==' ';
            count1++;
        }
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i)==' ')
            count2++;
        }
        if((count2-count1)%2==0)
          return "Even:"+Math.abs(count2-count1);
          else
          return "Odd:"+Math.abs(count2-count1);

       }
    
   
}
