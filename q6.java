import java.util.*;
public class q6 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  sc.close();

possible_combinations(str);

    }
   public static void possible_combinations(String str){
    String st1="";
    for(int i=0;i<str.length();i++){
        for(int j=i;j<str.length();j++){
            st1=st1+str.substring(i,j+1)+",";
        
        }
    }
   System.out.print(st1.substring(0,st1.length()-1));
    
   }
    
    
}
