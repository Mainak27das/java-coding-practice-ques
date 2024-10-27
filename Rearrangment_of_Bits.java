import java.util.Scanner;
public class Rearrangment_of_Bits {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        String binary= Convert_To_Binary(num);
        //Integer.ToBinaryString(num)

        System.out.println(binary);
        System.out.println(Smallest_No_AfterBit_Rearrangement(binary));
        
    }

    
   
   
   
   public static String Convert_To_Binary(int num){
    
     String str="";
     int rem=0;
     while(num>0){
        rem=num%2;
        str=rem+str;
        num/=2;
        
     }
      return str;
   }    

   public static int Smallest_No_AfterBit_Rearrangement(String binary){
    int count=0;
    int decimal=0;
    for(int i=0;i<binary.length();i++){
        if(binary.charAt(i)=='1')// binary[i]=='1'
        count++;
    }
    for(int j=0;j<count;j++){
        decimal+=Math.pow(2, j);
    }
    return decimal;

   }

}
