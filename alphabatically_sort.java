import java.util.Arrays;
import java.util.Scanner;

public class alphabatically_sort {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
       char [] arr = str.toCharArray();
      
       Arrays.sort(arr);
        
      System.out.println(Arrays.toString(arr));
      //akarsha=[a, a, a, h, k, r, s]
      System.out.println(new String (arr));
      //akarsha=aaahkrs
    }
}
