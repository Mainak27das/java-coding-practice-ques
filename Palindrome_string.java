import java.util.Scanner;

public class Palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        
       if(CheckPalindrome(str))
       System.out.println("It is Palindrome");
       else
       System.out.println("It is not  Palindrome");
    
 }
 public static boolean CheckPalindrome(String str){
    for(int i=0;i<str.length()/2;i++){
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            //str[i]!=str[n-1-i]
             return false;
        }
    }
    return true;
 }
}
