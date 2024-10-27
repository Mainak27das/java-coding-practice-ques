
import  java.util.Scanner;
public class Replace_0with1_of_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        sc.close();
       String binary= Integer.toString(num);
      
       binary= binary.replace('0', '1');
        
      System.out.println(Integer.parseInt(binary));
    }
    
}
