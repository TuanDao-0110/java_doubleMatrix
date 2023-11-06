import java.util.Scanner;

public class Exercise15 {

    public Exercise15() {
        // TODO Auto-generated constructor stub
    }

    // Input n:
    public static int enterN(Scanner scan) {
        int n;
        do {
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }

    // Input a 2D array:
    public static int[][] createArray(int numRows, int numCols, Scanner scan) {
        int[][] a = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.println("a[" + i + "]" + "[" + j + "] =");
                a[i][j] = Integer.parseInt(scan.nextLine());
            }
        }
        return a;
    }

    // Output a 2D array:
    public static void printArray(int a[][], int numRows, int numCols) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    // Check if the array is a sparse array or not
    public static void isSparseArray(int a[][], int numRows, int numCols) {
        int countZero = 0;
        int countNonZero = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (a[i][j] == 0) {
                    countZero++;
                } else {
                    countNonZero++;
                }
            }
        }
        if (countZero > countNonZero) {
            System.out.println("Matrix A is a sparse matrix.");
        } else {
            System.out.println("Matrix A is not a sparse matrix.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numRows = enterN(scan);
        System.out.println("Enter the number of columns: ");
        int numCols = enterN(scan);
        int a[][] = createArray(numRows, numCols, scan);
        System.out.println("The values of matrix A are: ");
        printArray(a, numRows, numCols);

        System.out.println("\n");
        isSparseArray(a, numRows, numCols);
    }
}
