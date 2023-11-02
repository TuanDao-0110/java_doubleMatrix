import java.util.Scanner;

public class Exercise9 {

    public Exercise9() {
        // TODO Auto-generated constructor stub
    }

    final static int min = -50;
    final static int max = 50;

    // Input n:
    public static int inputN(Scanner scan) {
        int n;
        do {
            System.out.println("Enter a value > 1: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }

    // Create a 2D array:
    public static int[][] createArray(int numRows, int numCols, Scanner scan) {
        int[][] a = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                a[i][j] = min + (int) (Math.random() * ((max - min) + 1));
            }
        }
        return a;
    }

    // Display a 2D array:
    public static void displayArray(int a[][], int numRows, int numCols) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    // Calculate the sum of odd values in each column:
    public static void sumOddColumn(int a[][], int numRows, int numCols) {
        int sum = 0;
        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                if (a[j][i] % 2 != 0) {
                    sum += a[j][i];
                }
            }
            System.out.println("Sum of integers in column " + i + " is: " + sum);
            sum = 0;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numRows = inputN(scan);
        System.out.println("Enter the number of columns:");
        int numCols = inputN(scan);
        int a[][] = createArray(numRows, numCols, scan);
        System.out.println("Array A values are: ");
        displayArray(a, numRows, numCols);
        sumOddColumn(a, numRows, numCols);
    }
}
