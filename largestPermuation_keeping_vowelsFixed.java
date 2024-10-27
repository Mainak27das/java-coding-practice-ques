import java.util.Scanner;

public class largestPermuation_keeping_vowelsFixed {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        sc.nextLine();
        String arr[]=new String[size];
       
        for(int i=0;i<size;i++){
            arr[i]=sc.nextLine();
        }
           
        sc.close();
        
        
       System.out.println(find_largestPermuation_keeping_vowelsFixed_inanStringArray (arr)); 
    }

    public static int find_largestPermuation_keeping_vowelsFixed_inanStringArray (String arr[]) {
        int perm=0;
        int maxperm=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
           for(int j=0;j<arr[i].length();j++){
             if((arr[i].charAt(j)!='a')&&(arr[i].charAt(j)!='e')&&(arr[i].charAt(j)!='i')&&(arr[i].charAt(j)!='o')
             &&(arr[i].charAt(j)!='u'))
             count++;
           }
           perm=fact(count);
           maxperm=Math.max(perm,maxperm);

        }
        
        
    
     return Math.max(maxperm, perm);
       
    }
    public static int fact(int n){
        if(n<=1)
        return 1;
        else 
        return n*fact(n-1);
    }
    
    
}
