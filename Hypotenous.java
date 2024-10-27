import java.util.Scanner;

public class Hypotenous {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases=sc.nextInt();
        
        int hypo_arr[]=new int[testcases];
        for(int i=0;i<testcases;i++){
            double height=sc.nextInt();
        double base=sc.nextInt();
      hypo_arr[i]= ((int) calculate_hypo(height,base));
        
        }
        
        sc.close();
       
        for(int i=0;i<testcases;i++){
            System.out.println(hypo_arr[i]);
        
         }
        }
        

    
   
   
   
   public static double calculate_hypo(double h, double b){
    
   return Math.ceil(Math.sqrt(h*h+b*b));
    
       
        
   }    
}
