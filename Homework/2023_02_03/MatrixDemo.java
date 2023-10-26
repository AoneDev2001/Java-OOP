public class MatrixDemo {
    private static void demo1() {
        int[][] A, B, C;

        System.out.println("\nDemo 1: Create 2 matrices by requiring user to input dimension of array and then multiply the matrices.");
        System.out.println("\nTo generate matrix A ");
        A = MatrixOperation.genMatrix();
        System.out.println("\nTo generate matrix B ");
        B = MatrixOperation.genMatrix();
        
        C = MatrixOperation.multiplyMatrix(A,B);

        System.out.println("\nMatrix A is:: ");
        MatrixOperation.displayMatrix(A);
        System.out.println("Matrix B is:: ");
        MatrixOperation.displayMatrix(B);
        if (C != null) {
            System.out.println("Result of matrix AXB is:: ");
            MatrixOperation.displayMatrix(C);
        } else {
            System.out.println("\n*** These two matrices cannot be multiplied ***" + "\n" + 
            "     ==> because the number of column of the first matrix is not equal to the number of row of the second matrix\n");
        }
        System.out.println("========================================================");
    }

    private static void demo2() {
        int[][] A, B, C;

        System.out.println("\nDemo 2: Create 2 matrices by setting the dimension of array in program and then multiply the matrices.");
        System.out.println("\nGenerate matrix A\n ...");
        A = MatrixOperation.genMatrix(6,5);
        System.out.println("\nGenerate matrix B\n ...");
        B = MatrixOperation.genMatrix(5,8);
        
        C = MatrixOperation.multiplyMatrix(A,B);

        System.out.println("\nMatrix A is:: ");
        MatrixOperation.displayMatrix(A);
        System.out.println("Matrix B is:: ");
        MatrixOperation.displayMatrix(B);
        System.out.println("Result of matrix AXB is:: ");
        MatrixOperation.displayMatrix(C);
        System.out.println("========================================================");
    }

    private static void demo3() {
        int[][] A, B, C;

        System.out.println("\nDemo 3: Create 2 matrices by setting the dimension of array in program and then add the matrices.");
        System.out.println("\nGenerate matrix A\n ...");
        A = MatrixOperation.genMatrix(4,5);
        System.out.println("\nGenerate matrix B\n ...");
        B = MatrixOperation.genMatrix(4,5);
        
        C = MatrixOperation.AddMatrix(A,B);

        System.out.println("Matrix A is:: ");
        MatrixOperation.displayMatrix(A);
        System.out.println("Matrix B is:: ");
        MatrixOperation.displayMatrix(B);
        System.out.println("Result of matrix A+B is:: ");
        MatrixOperation.displayMatrix(C);
        System.out.println("========================================================");
    }


    public static void main(String[] args) {
        demo2();
        
    }
}
