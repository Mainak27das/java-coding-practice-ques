import java.util.*;
public class Score_Caclculate {
    public static void main(String[] args) {

             Scanner sc= new Scanner(System.in);
             String str=sc.nextLine();
             sc.close();
             int count=0;
             int score=0;
             for(int i=0;i<str.length();i++){
              
                  if(str.charAt(i)=='H'){
                    score+=2;
                    count++;
                  }
                  
                  else if(str.charAt(i)=='T'){
                    score--;
                    count=0;
                  }
                 
                  if(count==3)
                  break;

                }
                
                System.out.println(score);
              

          
         

    }
    
}
