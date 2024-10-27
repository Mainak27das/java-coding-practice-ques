import java.util.*;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int greed_size= sc.nextInt();
        
        int greed[]= new  int[greed_size];
        for(int i=0;i<greed_size;i++){
            greed[i]=sc.nextInt();
        }
        int cookie_size= sc.nextInt();
        
        int cookie[]= new  int[cookie_size];
        for(int i=0;i<cookie_size;i++){
            cookie[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(no_of_contentChild(greed,cookie) );
        
    }

    public static int no_of_contentChild(int greed[], int cookie[]){
        Arrays.sort(greed);
        Arrays.sort(cookie);
        int count=0;

     for(int i=0;i<Math.min(greed.length,cookie.length);i++){
        if(cookie[i]>=greed[i])
        count++;
     }
     return count;
   }

    
}
