import java.util.*;
public class return_subarraysWithGiven_sum {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
                  arr[i]=sc.nextInt();
        }
        sc.close();
        String subarrays[]=return_subarraysWith_Given_sum(arr,sum);
        for(int i=0;i<subarrays.length;i++){
            System.out.println(subarrays[i]);
        }
    }
   public static String[] return_subarraysWith_Given_sum(int arr[],int n){
    ArrayList<String>list=new ArrayList<>();
    String str="";
    int sum=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            for(int k=i;k<=j;k++){
                sum+=arr[k];
                str=str+arr[k];
            }
            if(sum==n){
                list.add(str);
            }
            sum=0;
            str="";
        }
    }
    String subarrays[]=new String[list.size()];
    int idx=0;
   
        for(String s: list){
              subarrays[idx++]=s;
        }
    
    return subarrays;

   }
    
}
