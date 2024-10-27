import java.util.Scanner;

public class Palindrome_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        
       if(CheckPalindrome(num))
       System.out.println("It is Palindrome");
       else
       System.out.println("It is not  Palindrome");
  }

  public static boolean CheckPalindrome(int num){
    int orignialNo=num;
    int reversed=0;
    int rem;
    while(num>0){
          rem=num%10;
          reversed=reversed*10+rem;
          num/=10;
    }
    if(orignialNo==reversed)
    return true;//1
    else
    return false;//0

  }

}
