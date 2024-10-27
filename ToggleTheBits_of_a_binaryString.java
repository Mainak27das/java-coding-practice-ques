

import java.util.*;
public class ToggleTheBits_of_a_binaryString {
    public static int toggle_bitss_Then_turnToInt(int num){  
         String toggled_str="";
        String str= Integer.toBinaryString(num);
        
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='0'){
            toggled_str=toggled_str+'1';
        }
        
        else if(str.charAt(i)=='1'){
            toggled_str=toggled_str+'0';
        }
        
       }
       
        return Integer.parseInt(toggled_str,2);
    }  
       
    public static void main (String[] args) {  
        Scanner sc=new Scanner(System.in);
            int no=sc.nextInt();
            sc.close();
           
        System.out.print(toggle_bitss_Then_turnToInt(no));
    } 
           

    
}
