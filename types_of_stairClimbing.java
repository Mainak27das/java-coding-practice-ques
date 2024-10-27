import java.util.*;
public class types_of_stairClimbing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(No_of_possible_ways(n));
        
    
   }
   
   
   public static int No_of_possible_ways(int n){
    int prev2=1;
    int prev1=1;
    int cur=0;
    for(int i=2;i<n;i++){
         cur=prev1+prev2;
        prev2=prev1;
        prev1=cur;
    }
    return prev1;
    
  }
}

