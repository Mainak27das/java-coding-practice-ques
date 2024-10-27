
import java.util.*;
public class Snake_Water_Gun {
    public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
      String str=sc.nextLine();
      sc.close();
      System.out.println(Count_A_wins(str));

    }
    public static int Count_A_wins(String str){
        String words="";
        String games="";
        int wins=0;            
        for(int i=0;i<str.length();i++){
            words=words+str.charAt(i);
            if(words.equals("snake")){
              games=games+'s';
              words="";
            }
            if(words.equals("gun")){
                games=games+'g';
                words="";
              }
              if(words.equals("water")){
                games=games+'w';
                words="";
              }

        } //gswgswww
        for(int i=0;i<games.length();i+=2){
           if((games.charAt(i)=='s'&& games.charAt(i+1)=='w')||(games.charAt(i)=='w'&& games.charAt(i+1)=='g')||(games.charAt(i)=='g'&&games.charAt(i+1)=='s'))
           wins++;
        }
        return wins;
    }
    
}
