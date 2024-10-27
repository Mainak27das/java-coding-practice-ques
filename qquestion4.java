import java.util.*;
public class qquestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int mat[][]=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                mat[i][j]=sc.nextInt();
            }
          
        }
        sc.close();
        System.out.println(find_minimumm_steps_toReach_ccenter(mat));
        
        }
      
        
 
      public static int find_minimumm_steps_toReach_ccenter(int mat[][]){
        int element_row=0;
        int element_col=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
               if(mat[i][j]==1){
                 element_row=i;
                 element_col=j;

               }

            }
          
        }
        return (Math.abs( element_row-(mat.length/2))+Math.abs(element_col-(mat.length/2)));
             
    }
}
