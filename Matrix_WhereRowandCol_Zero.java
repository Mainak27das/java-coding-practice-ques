import java.util.Scanner;

public class Matrix_WhereRowandCol_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Read the size of the square matrix
        int[][] mat = new int[n][n];

        // Input matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        sc.close();

        // Find the index where both row and column are completely zero
        int index = indexAtWhichRowsAndColsAreZero(mat);
        if (index == -1) {
            System.out.println("No row and column are completely zero.");
        } else {
            System.out.println("Index where row and column are completely zero: " + index);
        }
    }

    public static int indexAtWhichRowsAndColsAreZero(int[][] mat) {
        int n = mat.length;

        // Loop through each index to check both row and column
       
        for (int i = 0; i < n; i++) {
            boolean isrow_col_zero=true;
            // Check row `i` and column `i` simultaneously
            for (int j = 0; j < n; j++) {
                // If either the row `i` or column `i` is not zero, exit loop
                if(i!=j){
                    if (mat[i][j] != 0 || mat[j][i] != 0) {
                        isrow_col_zero=false;
                        break;
                        
                    }
                }
                
            }

           
           if(isrow_col_zero)
                return i;
            
        }

        
        return -1;
    }
}
