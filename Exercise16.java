import java.util.Scanner;

public class Exercise16 {

    public Exercise16() {
        // TODO Auto-generated constructor stub
    }

    final static int min = -50;
    final static int max = 50;

    // Input n:
    public static int enterN(Scanner scan) {
        int n;
        do {
            System.out.println("Enter a value greater than 1: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }

    // Input a 2D array:
    public static int[][] createArray(int numRows, int numCols, Scanner scan) {
        int[][] a = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                a[i][j] = min + (int) (Math.random() * ((max - min) + 1));
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

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int numRows = enterN(scan);
        System.out.println("Enter the number of columns: ");
        int numCols = enterN(scan);
        int a[][] = createArray(numRows, numCols, scan);
        printArray(a, numRows, numCols);
    }
}
