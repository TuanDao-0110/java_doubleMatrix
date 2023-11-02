import java.util.Scanner;

public class Exercise5 {
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

    // Find the first integer in each row of the 2D array:
    public static void firstIntegerInEachRow(int a[][], int numRows, int numCols) {
        for (int i = 0; i < numRows; i++) {
            System.out.println("The first integer in row " + i + " is: " + a[i][0]);
        }
    }

    public Exercise5() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numRows = inputN(scan);
        System.out.println("Enter the number of columns:");
        int numCols = inputN(scan);
        int a[][] = createArray(numRows, numCols, scan);
        displayArray(a, numRows, numCols);
        firstIntegerInEachRow(a, numRows, numCols);
    }
}
