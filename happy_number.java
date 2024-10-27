//aa number is happy if the sum of square of its digit is equal to 1



import java.util.*;
public class happy_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Read the size of the square matrix
        

        sc.close();
          
        // Find the index where both row and column are completely zero
        if(ishappy(n))
        System.out.println("it is happy");
        else
        System.out.println("not happy");
    }
   

    public static boolean ishappy(int n) {
        int rem=0;
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        while(true){
            
            while(n>0){
                rem=n%10;
                sum+=Math.pow(rem,2);
                n/=10;
            }
            n=sum;
            if(n==1)
            return true;
            if(set.contains(n))
            return false;
            else 
            set.add(n);
            sum=0;
        }
    }
}
