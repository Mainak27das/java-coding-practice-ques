import java.util.Scanner;

public class tweleve_hour_system {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        int hour  = sc.nextInt();
        int mint  = sc.nextInt();
        
       
        sc.close();
        
        
        System.out.println(find_tweleve_hour_system (hour)+" "+mint);
    }

    public static int find_tweleve_hour_system(int h) {
        if(h>12)
       
        return Math.abs(12-h);
        return h;
    }
    
}
