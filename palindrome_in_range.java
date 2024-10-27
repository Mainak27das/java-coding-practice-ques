import java.util.*;

public class palindrome_in_range{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        
        sc.close();
        int palindrome[]=find_Armstrong_in_range(start,end);
        for(int i=0;i<palindrome.length;i++){
            System.out.println(palindrome[i]); 
        }
      
        
 }

 public static boolean isArmstrong(int n){
    int digits=0;
    int org_no=n;
    
    while(n>0){
        n/=10;
        digits++;
    }
    int armstrong=0;
    int rem=0;
    n=org_no;
    while(n>0){
        rem=n%10;
        armstrong+=Math.pow(rem,digits);
        n/=10;

    }
    if(org_no==armstrong)
    return true;
    else
    return false;

}
      public static int[] find_Armstrong_in_range(int start, int end){
        
        ArrayList<Integer>list=new ArrayList<>();
        
       
        for(int j=start;j<=end;j++){
            if(isArmstrong(j))
            list.add(j);

        }
        int palindromes[]= new int[list.size()];
        int idx=0;
        for(int num: list){
            palindromes[idx++]=num;
        }
       
    return palindromes;
       }
    
}