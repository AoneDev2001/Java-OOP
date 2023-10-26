import java.util.Random;
import java.util.Scanner;

public class MatrixOperation {
    
    public static void displayMatrix(int[][] M) {
        int row = M.length;
        int col = M[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(M[i][j] + "      ");
            }
            System.out.print("\n");
        }
    }

    public static int[][] multiplyMatrix(int[][] A, int[][] B) {

        int row1 = A.length;
        // int col1 = A[0].length;
        int row2 = B.length;
        int col2 = B[0].length;
        
        int C[][] = new int[row1][col2];
        
        if (A[0].length != B.length) {
            return null;
          
            }
        // หาผลคูณ
        int i, j, k;
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }

        return C;
    }

    public static int[][] AddMatrix(int[][] A, int[][] B) {

        int row1 = A.length;
        int col1 = A[0].length;
        

        int number[][] = new int[row1][col1];

        // หาผลบวก
        int i, j;
        for(i=0;i<row1;i++)
        {
            for( j=0;j<col1;j++)
            {
                
                number[i][j]=A[i][j]+B[i][j];
            }
            
        }
        return number;
    }

    public static int[][] genMatrix() {
        int row, col;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Please enter number of row:: ");
        row = sc.nextInt();
        System.out.print("Please enter number of column:: ");
        col = sc.nextInt();

        int[][] number = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = rand.nextInt(10);
            }
        }

        return number;
    }

    public static int[][] genMatrix(int row, int col) {

        int[][] number = new int[row][col];
        Random rand = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = rand.nextInt(10);
            }
        }

        return number;
    }

}
