import java.util.*;
public class valleyCount {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine(); 
        sc.close();
        
        
       System.out.println(find_no_of_valleys(str1)); 
    }

    public static int find_no_of_valleys(String str1) {
        int current_level=0;
        int valleyCount=0;
       for(int i=0;i<str1.length();i++){
        if(str1.charAt(i)=='D')
           current_level+=-1;
        if(str1.charAt(i)=='U')
            current_level+=1;
        if(current_level==-1){
            for(int j=i;j<str1.length();j++){
                if(str1.charAt(i)=='D')
           current_level+=-1;
        if(str1.charAt(i)=='U')
            current_level+=1;
            if(current_level==0)
               valleyCount++;
               break;
            }
        }    
       }
       return valleyCount;
    }
}