import java.util.*;

public class q7 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  sc.close();

possible_combinations(str);

    }
   public static void possible_combinations(String str){
    String nums[]=str.split("\\s+");
    int count=0;
    for(int i=0;i<nums.length-1;i++){
        
        for(int j=i+1;j<nums.length;j++){
            if(nums[i].charAt(0)==nums[j].charAt(0)){
                if(((nums[i].charAt(1)=='L')&&(nums[j].charAt(1)=='R'))||
                ((nums[i].charAt(1)=='R')&&(nums[j].charAt(1)=='L'))){
                    count++;
                    nums[i]="XX";
                    nums[j]="XX";
                }
            }
        }
        
    }
  System.out.println(count);
    
   }    
}
