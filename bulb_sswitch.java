import java.util.*;
public class bulb_sswitch {
    public static void main(String[] args) {

             Scanner sc= new Scanner(System.in);
             int arr_size=sc.nextInt();
             int arr[]=new int[arr_size];
             for(int i=0;i<arr_size;i++){
                arr[i]=sc.nextInt();
             }
            //  public static int Count(int arr, int size){

            //  }
            sc.close();
            int count=0;
            for(int i=0;i<arr.length;i++){
              if(arr[i]==0){
                if(count%2==0)
                count++;
              }
              else if(arr[i]==1){
                if(count%2!=0)
                count++;
              }
            }
            System.out.println(count);

    }
    
}
