
import java.util.*;
public class Count_Minimum_CandyBoxes_To_survive{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();//daily avaailable andy
       int E=sc.nextInt();//daily requirmnts
       int D=sc.nextInt();//total days to survive
        sc.close();
        System.out.println(Minimum_CandyBoxes_Tobuy(N,E,D));
    
    }
         public static int Minimum_CandyBoxes_Tobuy(int N,int E,int D){

             if(N<=E)
                return -1;
             
             
             else if(E==0||D==0)
             return -1;                 
            
            else{
                    int total_sundays=D/7;
                    int available_days= D-total_sundays; 
                    int min=(int)Math.ceil((double)(E*D)/N); 
                    if(min>available_days)   
                    return -1;
                    else
                    return min;
               }
           


         }

}