import java.util.Scanner;

public class conseqqutive {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        sc.close();
        System.out.println(find_largest_consequtive(arr));     
 }
    public static int find_largest_consequtive(int arr[]){
        int count=0;
        int maxcount=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==1){
                
                if(arr[i]==arr[i+1]){
                    count++;
                }
            }
            
            else{
                maxcount=Math.max(maxcount,count);
                count=1;
            }

        }
        return maxcount=Math.max(maxcount,count);
    }
}
