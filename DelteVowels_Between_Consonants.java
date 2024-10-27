import java.util.Scanner;

public class DelteVowels_Between_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        sc.close();
       
        
       System.out.println(To_DelteVowels_Between_Consonants(str));

    
   }
   
   
        public static String To_DelteVowels_Between_Consonants(String str){
        StringBuilder sb=new StringBuilder(str);
        for(int i=1;i<sb.length()-1;i++){
            if((sb.charAt(i-1)!='a'&&sb.charAt(i-1)!='e'&&sb.charAt(i-1)!='i'&&sb.charAt(i-1)!='o'&&sb.charAt(i-1)!='u')&&
            (sb.charAt(i+1)!='a'&&sb.charAt(i+1)!='e'&&sb.charAt(i+1)!='i'&&sb.charAt(i+1)!='o'&&sb.charAt(i+1)!='u')){
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();


    }
}