
import  java.util.*;
public class Even_Odd_DigitsSum_DigitMul {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        sc.close();
        System.out.println(Check_Even_Odd_DigitsSum_DigitMul(num));  
    

    }

    
    public static int  Check_Even_Odd_DigitsSum_DigitMul(int num){
        int rem=0;
        int sum=0;
        int mul=1;
        if(num%2==0){
            while (num>0) {
                rem=num%10;
                sum+=rem;
                num/=10;
            }
            return sum;

        }
        else{
            while (num>0) {
                rem=num%10;
                mul*=rem;
                num/=10;
            }
            return mul;
        }
    }

}
