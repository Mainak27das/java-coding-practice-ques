import java.util.*;
public class Sort_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
         
        int risk[] = new int[size];
        for (int i = 0; i < size; i++) {
            risk[i] = sc.nextInt();
        }
        sc.close();
        //Arrays.sort(risk);
       

       int temp=0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) { // Start from j = i + 1 to compare with arr[i]
                if (risk[i] > risk[j]) { // Swap if the element at i is greater than at j
                    // Swap arr[i] and arr[j]
                    temp = risk[i];
                    risk[i] = risk[j];
                    risk[j] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(risk[i]+" ");
        }
    }
}
