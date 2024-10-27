import java.util.*;

public class match_String_colors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  // Read the size of the square matrix
        

        sc.close();
          
        // Find the index where both row and column are completely zero
        
        System.out.println(pos_where_color_dont_match(str));
       
    }
   

    public static int pos_where_color_dont_match(String str) {
        String colors="rgb"; 
        int pos=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==colors.charAt(i))
          pos++;
           
        }
        return  pos+1;
        
    
 }
}
