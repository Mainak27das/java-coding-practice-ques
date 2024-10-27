import java.util.*;
public class frequency_elemnts_array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size= sc.nextInt();
        int arr[]= new  int[arr_size];
        for(int i=0;i<arr_size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int f[]=freqency_of_all_elemnts_inAarraay(arr);
        for(int i=0;i<f.length;i++){
            System.out.print (f[i]);
        }

    }

    public static int[] freqency_of_all_elemnts_inAarraay(int arr[]){
        int f[]=new int[arr.length];
        int idx=0;
      HashSet<Integer>set=new HashSet<>();
      for(int i=0;i<arr.length;i++){
        int count=1;
        if(!set.contains(arr[i])){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                count++;
            }
            f[idx++]=count;

        }
        else
        set.add(arr[i]);
        
      }    
      return  Arrays.copyOf(f, idx); 
        
            
    }
}
