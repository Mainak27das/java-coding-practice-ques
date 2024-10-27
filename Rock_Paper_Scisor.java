
import java.util.Scanner;
public class Rock_Paper_Scisor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(Winnig_move(str));
    
    }
         public static String Winnig_move (String str){

                 if(str.equals("Rock")){
                    return "paper";
                 }
                 
                 else if(str.equals("Scissor")){
                    return "Rock";
                 }
                 
                 else if(str.equals("Paper")){
                    return "Scissor";
                 }
                 
               return "Invaild move";


         }

}
