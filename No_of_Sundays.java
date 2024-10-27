import java.util.*;
public class No_of_Sundays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String startDay=sc.nextLine();
        int totalDays= sc.nextInt();
        sc.close();
       System.out.println(find_No_of_Sundays(startDay,totalDays)); 
        
 }
      public static int find_No_of_Sundays(String startDay,int totalDays){
        ArrayList<String> days= new ArrayList<>(Arrays.asList("mon","tue","wed","thu","fri","sat","sun"));
        int dayNo=days.indexOf(startDay);
       
       int totalSundays=0;
       if(startDay=="sun")
        totalSundays++;

         int totalWeeks=(totalDays/7);
         totalSundays+=totalWeeks;
          int remaining_days= totalDays%7;
          if((remaining_days)>=(7-dayNo))
          totalSundays++;
          return totalSundays;

          
    
       }
}